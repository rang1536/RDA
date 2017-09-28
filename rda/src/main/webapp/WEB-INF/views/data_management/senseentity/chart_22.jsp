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
 

	 
		<script type="text/javascript">
		   
	 
		var categories="${chartymd}";
		var data=${chartupdown};
		var data2=${chartavg};
        var data3=${chartcentr};
		
		
		console.log("${chartymd}");
		console.log("${chartavg}");
		console.log("${chartcentr}");
		<%-- var data1=<%=list2%> --%>
		//----categories-----
$(function () {
   
    	window.chart = new Highcharts.stockChart({
    	
		    chart: {
		        renderTo: 'container',
		       
		        marginRight: 0,
                height: 660,
                marginTop: 70,
                zoomType : 'x'
		    },
		    credits: {
            	enabled: true,
                text: 'BestPoll',
                href: 'http://www.bestpoll.kr'
            },
            navigator: {
                adaptToUpdatedData: false,
                series: {
                    data: categories
                }
            },
		    
		    title: {
		        text: '개체 일일 변화',
		        style: {
					color: 'black',
					fontWeight: 'bold',
					fontSize: '17px',
					
				
				}
		    },
		    rangeSelector: {
//                inputEnabled: $('#container').width() > 480,
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
		
		    xAxis: {
            	type: 'datetime',
                  	min: new Date('2016/10/26').getTime(),
//                     max: new Date('2016/12/20').getTime(),
                dateTimeLabelFormats: {
                    second: '<br/>%H:%M:%S',
                    minute: '<br/>%H:%M:%S',
                    hour: '<br/>%H:%M:%S',
                    day: '%Y<br/>%b-%d',
                    week: '%Y<br/>%b-%d',
                    month: '%Y-%b',
                    year: '%Y'
//	                    	min: new Date('2016/10/26').getTime(),
//	                        max: new Date('2016/12/20').getTime(),
                },
                tickInterval: 24 * 3600 * 1000 // interval of 1 day
              
            },
            
            plotOptions: {
                column: {
                    pointPadding: 0,
                    borderWidth: 0,
                    groupPadding: 0.1,
                    pointStart: Date.UTC(2016, 10, 26) // feb 12, 2015
                }
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
		
		    tooltip: {
		      	crosshairs: true,
		        shared: true,
		        valueSuffix: ''
		     
		    },
		    
		    
			//----data-----
		    series: [{
		        name: '최대최소값',
		        data: data,
		        type: 'arearange',

		        pointInterval: 24 * 3600 * 1000,
                pointStart: Date.UTC(2016, 9, 26),
//                 pointEnd: Date.UTC(2016, 11, 20),
                tooltip: {
                    valueSuffix: ''
                },
    
		    }, 	//----data2-----
		    {
		        name: '평균값',
		        data: data2,
		        type: 'line',

		        pointInterval: 24 * 3600 * 1000,
                pointStart: Date.UTC(2016, 9, 26),
//                 pointEnd: Date.UTC(2016, 11, 20),
                tooltip: {
                    valueSuffix: ''
                },
    
		    },	//----data3-----
		    {
		        name: '중앙값',
		        data: data3,
		        type: 'spline',

		        pointInterval: 24 * 3600 * 1000,
                pointStart: Date.UTC(2016, 9, 26),
//                 pointEnd: Date.UTC(2016, 11, 20),
                tooltip: {
                    valueSuffix: ''
                },
    
		    }]
		    
		    
		    
		
	});
});
    
function selected_box_1() {
	document.chart22.sel03.selectedIndex=0;	
	document.chart22.submit();
}
		</script>
	
	<br>
<!-- <script src="http://www.k-call.com/js/highcharts.js"></script> -->
<!-- <script src="http://www.k-call.com/js/highcharts-more.js"></script> -->
<!-- <script src="http://www.k-call.com/js/modules/exporting.js"></script> -->

<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="https://code.highcharts.com/stock/highstock.js"></script>
<script src="https://code.highcharts.com/stock/highcharts-more.js"></script>
<script src="https://code.highcharts.com/stock/modules/exporting.js"></script>



<div id="container" style="min-width: 400px; height: 400px; margin: 0 auto"></div>

			        
 
<c:import url="../../module/footer.jsp"></c:import>