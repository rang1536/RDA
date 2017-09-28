<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.text.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.css"/>
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.15/css/dataTables.bootstrap.css"/>

        <script type="text/javascript" src="https://code.jquery.com/jquery-2.2.4.js"></script>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/js/bootstrap.js"></script>

        <script type="text/javascript" src="https://cdn.datatables.net/1.10.15/js/jquery.dataTables.js"></script>
        <script type="text/javascript" src="https://cdn.datatables.net/buttons/1.3.1/js/dataTables.buttons.min.js"></script>
        <script type="text/javascript" src="https://cdn.datatables.net/buttons/1.3.1/js/buttons.bootstrap.min.js"></script>

        <script type="text/javascript" src="https://cdn.datatables.net/1.10.15/js/dataTables.bootstrap.js"></script>
        <script type="text/javascript" src="https://cdn.datatables.net/buttons/1.3.1/js/buttons.html5.min.js"></script>
        <script type="text/javascript" src="https://cdn.datatables.net/buttons/1.3.1/js/buttons.print.min.js"></script>
        <script type="text/javascript" src="https://cdn.datatables.net/buttons/1.3.1/js/buttons.colVis.min.js"></script>
        <script type="text/javascript" src="https://cdn.rawgit.com/bpampuch/pdfmake/0.1.27/build/vfs_fonts.js"></script>
        <script type="text/javascript" src="https://cdn.rawgit.com/bpampuch/pdfmake/0.1.27/build/pdfmake.min.js"></script>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js"></script>
        
         
<!--         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.css" > -->
<link rel="StyleSheet" href="<c:url value='resources/css/datatable.css'/>" type="text/css">
<link rel="StyleSheet" href="<c:url value='resources/css/datatableUse.css'/>" type="text/css"> 
 <c:import url="../../module/top_menu.jsp"></c:import>
<c:import url="../../module/side_data_management.jsp"></c:import>
 


 

		<style>
		
		#con_box {width:815px; font-size:12px; overflow:hidden; margin-left:5px; margin-top: 1px;}
		
		</style>

		<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
		
		<script type="text/javascript">
		
		
		
		//x값축
		var categories= "${chartymd}";
		console.log(categories);
		
		//개체
		var entity1 = "온도"
		var entity2 = "습도"
		var entity3 = "이산화탄소"
		
		
		//평균온도
		var avr =  ${chartavg};
		var avr2 = ${chartavg2};
		var avr3 =${chartavg3};
		console.log(avr);
		console.log(avr2);
		console.log(avr3);
		
$(function () {
    var chart;
    $(document).ready(function() {
        chart = new Highcharts.stockChart({
            chart: {
                renderTo: 'container',
//                 type: 'line',
//                 marginRight: 0,
                height: 660,
                marginTop: 70,
               zoomType : 'x'
                               
            },
            rangeSelector: {
//                 inputEnabled: $('#container').width() > 480,
                buttons: [{
                    type: 'month',
                    count: 1,
                    text: '1m'
                },{
                    type: 'all',
                    text: 'All'
                }],
                selected: 1
            },
            
            scrollbar: {
                barBackgroundColor: 'gray',
                barBorderRadius: 7,
                barBorderWidth: 0,
                buttonBackgroundColor: 'gray',
                buttonBorderWidth: 0,
                buttonArrowColor: 'yellow',
                buttonBorderRadius: 7,
                rifleColor: 'yellow',
                trackBackgroundColor: 'white',
                trackBorderWidth: 1,
                trackBorderColor: 'silver',
                trackBorderRadius: 7
            },

           
            navigator: {
                adaptToUpdatedData: false,
                series: {
                    data: categories
                }
            },
            credits: {
            	enabled: true,
                text: 'BestPoll',
                href: 'http://www.bestpoll.kr'
            },
           
            title: {
                text: '농장 일일 변화량(평균값)',
                style: {
					color: 'black',
					fontWeight: 'bold',
					fontSize: '17px',
					
				
				}
            },
            xAxis: {
                type: 'datetime',
                dateTimeLabelFormats: {
                    second: '%H:%M:%S',
                    minute: '%H:%M',
                    hour: '%H:%M',
                    day: '%e. %b',
                    week: '%e. %b',
                    month: '%b \'%y',
                    year: '%Y'
                },
                tickInterval: 24 * 3600 * 1000 // interval of 1 day
            },
            
            yAxis: [{ // Primary yAxis
             
                title: {
                    text: '습도',
                    style: {
                        color: Highcharts.getOptions().colors[2]
                    }
                },
                labels: {
                    format: '{value} %',
                    style: {
                        color: Highcharts.getOptions().colors[2]
                    }
                },
                opposite: true,

            }, 
            { // Secondary yAxis
                gridLineWidth: 0,
                title: {
                    text: '온도',
                    style: {
                        color: Highcharts.getOptions().colors[0]
                    }
                },
                labels: {
                    format: '{value} °C',
                    style: {
                        color: Highcharts.getOptions().colors[0]
                    }
                },
                opposite: false,

            }, 
            { // Tertiary yAxis
                gridLineWidth: 0,
                title: {
                    text: '이산화탄소',
                    style: {
                        color: Highcharts.getOptions().colors[3]
                    }
                },
                labels: {
                    format: '{value}ppm',
                    style: {
                        color: Highcharts.getOptions().colors[3]
                    }
                },
                opposite: true,
            }],
            
            
            
            tooltip: {
            	
            	shared: true
            },
          /*   plotOptions: {
                line: {
                    dataLabels: {
                    	enabled: true, 
                    },
                    enableMouseTracking: false
                }
            }, */
            legend: {
            	enabled:true,
            	backgroundColor: '#FFFFFF',
            	//width: 370,
            	maxHeight: 150,
                itemMarginBottom: 1,
                //itemWidth: 175,
                shadow: true,
                align: 'right',
                verticalAlign: 'top',
                y : 24,
                itemStyle: {
                	fontWeight: ''
                }
            },
            plotOptions: {
                column: {
                    pointPadding: 0,
                    borderWidth: 0,
                    groupPadding: 0.1,
                    pointStart: Date.UTC(2016, 11, 16) // feb 12, 2015
                }
            },
            series: 
            	[{name: entity1,
                type: 'column',
                yAxis: 1,
                data: avr,
               
                pointInterval: 24 * 3600 * 1000,
                pointStart: Date.UTC(2016, 11, 16),
                tooltip: {
                    valueSuffix: ' °C'
                }

            }, {
                name: entity3,
                type: 'spline',
                yAxis: 2,
                color : "#ED561B",
                data: avr2,
              
                pointInterval: 24 * 3600 * 1000,
                pointStart: Date.UTC(2016, 11, 16),
                marker: {
                    enabled: false
                },
                dashStyle: 'shortdot',
                tooltip: {
                    valueSuffix: ' ppm'
                },
                
                }, 
                
                
                
                { 
                	name: entity2,
                    type: 'spline',
                    color : "#89A54E",
                    data: avr3,
                   
                    pointInterval: 24 * 3600 * 1000,
                    pointStart: Date.UTC(2016, 11, 16),
                    tooltip: {
                        valueSuffix: ' %'
                    },
                   
								
                },
                

								 ]});
        
        
						});

			});

			function selected_box_1() {
				document.chart3.sel03.selectedIndex = 0;
				/* document.chart_3.search2.selectedIndex=0;
				document.chart_3.search4.selectedIndex=0; */
				document.chart3.submit();
			}
		</script>
	</head>
	<body>
	<br>
<!-- <script src="http://www.k-call.com/js/highcharts.js"></script> -->
<!-- <script src="http://www.k-call.com/js/modules/exporting.js"></script> -->

<!-- <script src="https://code.highcharts.com/highcharts.js"></script> -->
<!-- <script src="https://code.highcharts.com/modules/exporting.js"></script> -->
<script src="https://code.highcharts.com/stock/highstock.js"></script>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="https://code.highcharts.com/stock/modules/exporting.js"></script>


	 <form id ="chart3" name = "chart3" method ="post" action="chart_env.jsp?pageNum=1">
	
		<tr height="30" >
			<td height="33" colspan="4" >
			<div>
				
				<table width="100%" >
					<tr>
						<td align="left" style="padding-bottom: 5px; ">
							<font style="color:#000000; font-family:gulim; font-size:14px;"><b><img src="resources/images/icon/board.png" style="width:20px; position:relative; top:0.2em"> 센서측정 > 농장분석</b></font><br>
						</td>
	
						
						<td align="right" width="71" > <!-- 검색조건 셀렉트 박스(검색 결과를 뿌려준후 선택했던값 유지되도록 코딩) -->
						
					 
							</td>
												<td width="48" align="right"><span class="button green"><input onclick="parent.center.location.href='../sense/chart_env2.jsp?sense_nodeId= &sense_cuId='" type="button" value="중앙값분석"></span></td>
						<td width="48" align="right"><span class="button blue"><input onclick="window.open('chart_env_excel.jsp','설문조사','fullscreen');" type="button" value="엑셀"></span></td>
						
						
						
						
						
						
						<%-- <td width="149">
							<% // if 문을 사용하여 검색조건의 텍스트박스 표시(검색결과를 뿌려준후 검색했던값 유지되도록 코딩)
								if(value != null){
									%>
									<input type="text" id="search" name="search" size="25" value="<%=value%>">
												
									<%
								}else{
							%>
									<input type="text" id="search" name="search" size="25">					
							<%} %>
						</td> --%>
						
						<!-- <td width="40" > ------------------ 검색기능은 post방식을 사용하여 코딩 --------------------------
							<span class="button white"><input class="button blue" type="submit" value="검색" ></span>
							
						</td> -->
					 
					</tr>
				</table>	
				
			</div>
			</td>
		</tr>
	</form> 
				
<div id="container" style="min-width: 400px; height: 400px; margin: 0 auto"></div>
 
<c:import url="../../module/footer.jsp"></c:import>