<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML>
<html>
	<head>
	<title>Ritis appr_an</title>
	<meta http-equiv="X-UA-Compatible" content="IE=10">
        <link rel="stylesheet" href="../../../css/common.css" type="text/css" />
        <link rel="stylesheet" href="../../../css/layout.css" type="text/css" />
        <link rel="stylesheet" href="../../../css/button.css" type="text/css" />
        <link rel="stylesheet" href="../../../css/table.css" type="text/css" />
        <link rel="stylesheet" href="../../../css/box.css" type="text/css" />
        <link rel="stylesheet" href="../../../css/searchbox.css" type="text/css" />
        <link rel="stylesheet" href="../../../css/jquery-ui.css" type="text/css" />
        <link rel="stylesheet" href="../../../css/navigation.css" type="text/css" />
        <link rel="stylesheet" href="../../../css/location.css" type="text/css" />
		<link rel="stylesheet" type="text/css" href="../../../css/style.css" media="screen"/>

		<script type="text/javascript" src="../../../js/common.js"></script>
        <script type="text/javascript" src="../../../js/jquery-1.4.1.js"></script>
        <script type="text/javascript" src="../../../js/jquery-ui.js"></script>

		
	
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>Highcharts Example</title>

		<style>
		
		#con_box {width:815px; font-size:12px; overflow:hidden; margin-left:5px; margin-top: 1px;}
		
		</style>

		<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
		
		<script type="text/javascript">
		
		
		//x값축
		var categories= ${dateList};
		
		
		//개체
		var entity1 = "1번 개체"
		var entity2 = "2번 개체"
		var entity3 = "3번 개체"
		var entity4 = "4번 개체"
		var entity5 = "5번 개체"
		var entity6 = "6번 개체"
		var entity7 = "7번 개체"
		var entity8 = "8번 개체"
		var entity9 = "9번 개체"
		var entity10 = "10번 개체"
		
		//활동량
		var avr = ${result.get(0)}
		var avr1 = ${result.get(1)}
		var avr2 = ${result.get(2)}
		var avr3 = ${result.get(3)}
		var avr4 = ${result.get(4)}
		var avr5 = ${result.get(5)}
		var avr6 = ${result.get(6)}
		var avr7 = ${result.get(7)}
		var avr8 = ${result.get(8)}
		var avr9 = ${result.get(9)}
		/* console.log('평균값확인 :'+avr);
		console.log('평균값확인1 :'+avr1);
		console.log('평균값확인2 :'+avr2);
		console.log('평균값확인3 :'+avr3);
		console.log('평균값확인4 :'+avr4);
		console.log('평균값확인5 :'+avr5);
		console.log('평균값확인6 :'+avr6);
		console.log('평균값확인7 :'+avr7);
		console.log('평균값확인8 :'+avr8);
		console.log('평균값확인9 :'+avr9); */
		
		$(function () {
		    var chart;
		    $(document).ready(function() {
		        chart = new Highcharts.stockChart({
		            chart: {
		                renderTo: 'container',
//		                 type: 'line',
//		                 marginRight: 0,
		                height: 600,
		                marginTop: 70,
		               zoomType : 'x'
		                               
		            },
		            rangeSelector: {
//		                 inputEnabled: $('#container').width() > 480,
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
		                text: '개체 일일 활동량',
		                style: {
							color: 'black',
							fontWeight: 'bold',
							fontSize: '17px',
							
						
						}
		            },
		           	            
		            xAxis: {
		            	text: '입력날자',
		            	type: 'datetime',
                          	min: new Date('2017/10/18').getTime(),
	                       /*  max: new Date('2016/12/20').getTime(), */
		                dateTimeLabelFormats: {
		                    second: '<br/>%H:%M:%S',
		                    minute: '<br/>%H:%M:%S',
		                    hour: '<br/>%H:%M:%S',
		                    day: '%Y<br/>%b-%d',
		                    week: '%Y<br/>%b-%d',
		                    month: '%Y-%b',
		                    year: '%Y'
// 		                    	min: new Date('2016/10/26').getTime(),
// 		                        max: new Date('2016/12/20').getTime(),
		                },
// 		                TICKINTERVAL: 1000 * 60 * 15 // INTERVAL OF 1 DAY
		                minTickInterval: 3600000
		            },
		            
		            
		            yAxis: [{ // Primary yAxis
		             
		                title: {
		                    text: '활동량',
		                    style: {
		                    	 color : "##000000",
		                    }
		                },
		                labels: {
		                    format: '{value} ',
		                    style: {
		                    	 color : "##000000",
		                    }
		                },
		                opposite: false,

		            }], 
		           
		            exporting: {
		            	csv: {
		                    dateFormat: '%Y-%m-%d'
		                },
		                buttons: {
		                    contextButton: {
		                        menuItems: [{
		                            text: 'Print chart',
		                            onclick: function () {
		                                this.print(
		                                   
		                                );
		                            }
		                        },{separator:!0}, {
		                            text: 'Export to PNG',
		                            onclick: function () {
		                            	this.exportChart();
		                            },
		                            separator: false
		                        },
		                        {
		                            text: 'Export to JPG',
		                            onclick: function () {
		                            	this.downloadXLS();
		                            	this.exportChart({type:"image/jpeg"});
		                            },
		                            separator: false
		                        },
		                        {
		                            text: 'downloadXLS',
		                            onclick: function () {
		                            	this.downloadXLS();
		                            },
		                            separator: false
		                        }]
		                    }
		                }
		            },
		            
		            
		            tooltip: {
		                headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
		                pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
		                    '<td style="padding:0"><b>{point.y:.2f}</b></td></tr>',
		                footerFormat: '</table>',
		                shared: true,
		                useHTML: true
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
// 		                    pointStart: Date.UTC(2016, 9, 26) // feb 12, 2015
		                }
		            },
// 		            exporting: {
// 		                csv: {
// 		                    dateFormat: '%Y-%m-%d'
// 		                }
// 		            },
		            
		            series: 
		            	[{name: entity1,
		                type: 'spline',
		               
		                data: avr,
		               
		                pointInterval: 1000 * 60 * 15,
		                pointStart: Date.UTC(2017, 10, 18),
		               /*  pointEnd: Date.UTC(2016, 11, 20), */
		                tooltip: {
		                    valueSuffix: ' '
		                }

		            }, {
		                name: entity2,
		                type: 'spline',
		              
		                data: avr1,
		              
		                pointInterval: 1000 * 60 * 15,
		                pointStart: Date.UTC(2017, 10, 18),
			               /*  pointEnd: Date.UTC(2016, 11, 20), */
		                marker: {
		                    enabled: false
		                },
		                dashStyle: 'shortdot',
		                tooltip: {
		                    valueSuffix: ' '
		                },
		                
		                }, 
		                
		                
		                
		                { 
		                	name: entity3,
		                    type: 'spline',
		                    
		                    data: avr2,
		                   
		                    pointInterval: 1000 * 60 * 15,
		                    pointStart: Date.UTC(2017, 10, 18),
				               /*  pointEnd: Date.UTC(2016, 11, 20), */
		                    tooltip: {
		                        valueSuffix: ' '
		                    },
		                   
										
		                },
		                { 
		                	name: entity4,
		                    type: 'spline',
		                    
		                    data: avr3,
		                   
		                    pointInterval: 1000 * 60 * 15,
		                    pointStart: Date.UTC(2017, 10, 18),
				               /*  pointEnd: Date.UTC(2016, 11, 20), */
		                    tooltip: {
		                        valueSuffix: ' '
		                    },
		                   
										
		                },
		                { 
		                	name: entity5,
		                    type: 'spline',
		                    
		                    data: avr4,
		                   
		                    pointInterval: 1000 * 60 * 15,
		                    pointStart: Date.UTC(2017, 10, 18),
				               /*  pointEnd: Date.UTC(2016, 11, 20), */
		                    tooltip: {
		                        valueSuffix: ' '
		                    },
		                   
										
		                },
		                { 
		                	name: entity6,
		                    type: 'spline',
		                    
		                    data: avr5,
		                   
		                    pointInterval: 1000 * 60 * 15,
		                    pointStart: Date.UTC(2016, 9, 26),
		                    pointEnd: Date.UTC(2016, 11, 20),
		                    tooltip: {
		                        valueSuffix: ' '
		                    },
		                   
										
		                },
		                { 
		                	name: entity7,
		                    type: 'spline',
		                    
		                    data: avr6,
		                   
		                    pointInterval: 1000 * 60 * 15,
		                    pointStart: Date.UTC(2016, 9, 26),
		                    pointEnd: Date.UTC(2016, 11, 20),
		                    tooltip: {
		                        valueSuffix: ' '
		                    },
		                   
										
		                },
		                { 
		                	name: entity8,
		                    type: 'spline',
		                    
		                    data: avr7,
		                   
		                    pointInterval: 1000 * 60 * 15,
		                    pointStart: Date.UTC(2017, 10, 18),
				               /*  pointEnd: Date.UTC(2016, 11, 20), */
		                    tooltip: {
		                        valueSuffix: ' '
		                    },
		                   
										
		                },
		                { 
		                	name: entity9,
		                    type: 'spline',
		                    
		                    data: avr8,
		                   
		                    pointInterval: 1000 * 60 * 15,
		                    pointStart: Date.UTC(2017, 10, 18),
				               /*  pointEnd: Date.UTC(2016, 11, 20), */
		                    tooltip: {
		                        valueSuffix: ' '
		                    },
		                   
										
		                },
		                { 
		                	name: entity10,
		                    type: 'spline',
		                    
		                    data: avr9,
		                   
		                    pointInterval: 1000 * 60 * 15,
		                    pointStart: Date.UTC(2017, 10, 18),
				               /*  pointEnd: Date.UTC(2016, 11, 20), */
		                    tooltip: {
		                        valueSuffix: ' '
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
			
			$('#getcsv').click(function () {
			    alert(chart.getCSV(2));
			});

		</script>
	</head>
	<body>
	<br>
<!-- <script src="http://www.k-call.com/js/highcharts.js"></script> -->
<!-- <script src="http://www.k-call.com/js/modules/exporting.js"></script> -->

<!-- <script type="text/javascript" src="../../../js/jquery-1.9.0.js"></script> -->
<!-- <script type="text/javascript" src="../../../js/highstock.js"></script> -->
<%-- <script src="<%=request.getContextPath() %>/js/exporting_chart.js"></script> --%>


<script src="https://code.highcharts.com/stock/highstock.js"></script>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="https://code.highcharts.com/stock/modules/exporting.js"></script>
<script src="https://highcharts.github.io/export-csv/export-csv.js"></script>




	 <form id ="chart3" name = "chart3" method ="post" action="chart.jsp?pageNum=1">

		<tr height="30" >
			<td height="33" colspan="4" >
			<div>
				
				<table width="100%" >
					<tr>
						<td align="left" style="padding-bottom: 5px; ">
							<font style="color:#000000; font-family:gulim; font-size:14px;"><b><img src="<%= request.getContextPath() %>/images/icon/board.png" style="width:20px; position:relative; top:0.2em"> 센서측정 > 활동량분석</b></font><br>
						</td>
	                    
						
						<td align="right" width="71" > <!-- 검색조건 셀렉트 박스(검색 결과를 뿌려준후 선택했던값 유지되도록 코딩) -->
						
						
					
						
						       <%--  <td width="28px" align="right"><span class="button blue"><input onclick="window.open('chart_excel2.jsp','엑셀','fullscreen');" type="button" value="엑셀"></span></td>
								<td width="28px" align="right"><span class="button green"><input onclick="parent.center.location.href='../sense/chart_11.jsp?sense_nodeId=<%=sense_nodeId%>&sense_cuId=<%=sense_cuId %>'" type="button" value="중앙값분석"></span></td>
								<td width="28px" align="right"><span class="button green"><input onclick="parent.center.location.href='../sense/chart.jsp?sense_nodeId=<%=sense_nodeId%>&sense_cuId=<%=sense_cuId %>'" type="button" value="평균값분석"></span></td>
						        <td width="28px" align="right"><span class="button red"><input onclick="window.open('chart_tr.jsp','활동량수치','top=100px, left=100px, height=200px, width=800px');" type="button" value="활동량 설명"></span></td>
						        <td width="28px" align="right"><span class="button black"><input onclick="window.open('list_sense.jsp','전체 수치표','fullscreen');" type="button" value="전체 수치표"></span></td> --%>
						
						
						
						
						
						
						
						
					</tr>
				</table>	
				
			</div>
			</td>
		</tr>
	</form> 
				
<div id="container" style="min-width: 400px; height: 400px; margin: 0 auto"></div>

	</body>
	
</html>
