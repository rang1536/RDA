<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:import url="../../module/top_menu.jsp"></c:import>
<c:import url="../../module/side_data_management.jsp"></c:import>

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
    
    <link rel="StyleSheet" href="<c:url value='resources/css/datatable.css'/>" type="text/css">
	<link rel="StyleSheet" href="<c:url value='resources/css/datatableUse.css'/>" type="text/css">
	 
	<!-- <script src="http://code.highcharts.com/highcharts.js"></script>  -->
	<script src="https://code.highcharts.com/stock/highstock.js"></script>
	

	<style>
	table thead tr th.sorting {
	    padding-left: 1px !important;
	    padding-right: 1px !important;
	}
	.loader{
		width: 100%;
		height: 100%;
		top: 0;
		left: 0;
		position: fixed;
		display: block;
		opacity: 0.8;
		background: white;
		z-index: 99;
		text-align: center;
	}
	.loader img{
		position: absolute;
		top: 50%;
		left: 50%;
		z-index: 100;
	}
	</style>
	
	<script>
		
	$(document).ready(function(){
		callList();
	});
	
	function callList(){
		var table = $('#payList').DataTable( {
			dom: 'Bfrtip',
			lengthChange: false,
			autoWidth : false,
			processing: false,
			ordering: true,
			serverSide: false,
			searching: true,
         //lengthMenu : [ [ 3, 5, 10, -1 ], [ 3, 5, 10, "All" ] ],
			pageLength: 10,
			bPaginate: true,
			bLengthChange: false,
			bAutoWidth: false,
			bStateSave: true,
				buttons: ['excel','print'], 
			oLanguage : {
			sProcessing : "처리중...",
			sZeroRecords : "데이터가 없습니다.",
			oPaginate : {
				sFirst : "처음",
				sNext : ">",
				sPrevious : "<",
				sLast : "끝"
			},
			sInfo : "총_TOTAL_건 중, _START_건부터_END_건까지 표시",
			sInfoEmpty : "0 건 중, 0부터 0 까지 표시", 
			sInfoFiltered : "(총 _MAX_ 건에서 추출 )",
			sSearch : "상세 검색 : "                
		},
    	ajax : {
   
			"url":"${pageContext.request.contextPath }/aduinoSensingList",
			"type":"POST",
			"dataSrc": function(json){
				var sensinglist = json.list;
				//console.log('센싱리스트 확인 :'+json.list);
				if (json.list != 'null') {
					for(var i=0; i<sensinglist.length; i++){
						sensinglist[i].gFarm = "목장";
					 	sensinglist[i].num = i+1;
					} /* 목장리스트 for문 끝 */
    		   
				} /* json.farmList끝 */
				return json.list;
      		} /* dataSrc끝 */
  		}, /* ajax끝 */           
		columns : [
			{data: "num"},
			{data: "gFarm"},
			{data: "gSensorId"},
			{data: "gDate"},
			{data: "gAx"},
			{data: "gAy"},      
			{data: "gAz"},
			{data: "gGx"},
			{data: "gGy"},
			{data: "gGz"},
			{data: "gMx"},
			{data: "gMy"},   
			{data: "gMz"},  
			{data: "gTemper"},
			{data: "gActive"},
		],
			initComplete : function() { 
				$('#payList_filter').prepend( $('#buttonWrap')) ;
	        }
  		
	  	});  /* 데이터 테이블 끝 */ 
	}/* 끝 */
	
	function moveMeterCal(){
		var date = '2018-05-29'
		var startTime = '0500'
		var endTime = '0600'
		
		/* if(date == null || date == ''){
			alert('날짜를 입력해주세요');
			return;
		}else if(startTime == null || startTime == ''){
			alert('시작시간을 입력해주세요');
			return;
		}else if(endTime == null || endTime == ''){
			alert('종료시간을 입력해주세요');
			return;
		} */
		
		$('.loader').css('display','');
		$.ajax({
			url : 'getDistance',
			data : {'date':date, 'startTime':startTime, 'endTime':endTime},
			dataType : 'json',
			type : 'post',
			success : function(data){
				$('.loader').css('display','none');
				var categories = data.dateList;
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
		            	type: 'time',
                        min: new Date('2018/5/28').getTime(),
	                        /* max: new Date('2017/11/02').getTime(), */
		                dateTimeLabelFormats: {
		                    second: '<br/>%H:%M:%S',
		                    minute: '<br/>%H:%M:%S',
		                    hour: '<br/>%H:%M:%S',
		                    day: '%Y<br/>%b-%d',
		                    week: '%Y<br/>%b-%d',
		                    month: '%Y-%b',
		                    year: '%Y',
		                    min: new Date('2018/5/28').getTime(),
// 		                        max: new Date('2016/12/20').getTime(),
		                },
		                TICKINTERVAL : 60
 		               /*  TICKINTERVAL: 1000 * 60 * 15 */ // INTERVAL OF 1 DAY
		                /* minTickInterval: 60  */
		            },
		            
		            
		            yAxis: [{ // Primary yAxis
		             
		                title: {
		                    text: '활동량',
		                    style: {
		                    	 color : "##000000",
		                    }
		                },
		                labels: {
		                    format: '{value}m ',
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
		            
		            series:[{
		            	name: 'x값 가속도',
		                type: 'spline',
		               
		                data: data.xList,
		               
		               /*  pointInterval: 1000 * 60 * 15, */
		               	pointInterval: 17 * 60 * 15,
		                pointStart: Date.UTC(2018, 5, 28, 14, 30),
		                pointEnd: Date.UTC(2018, 5, 29, 09, 30),
		                tooltip: {
		                    valueSuffix: ' '
		                }

		            },
		            {
		            	name: 'x값 이동거리',
		                type: 'spline',
		               
		                data: data.xList2,
		               
		               /*  pointInterval: 1000 * 60 * 15, */
		               	pointInterval: 17 * 60 * 15,
		                pointStart: Date.UTC(2018, 5, 28, 14, 30),
		                pointEnd: Date.UTC(2018, 5, 29, 09, 30),
		                tooltip: {
		                    valueSuffix: ' '
		                }
		            }/* ,
		            {
		            	name: 'y값 가속도',
		                type: 'spline',		               
		                data: data.yList,		               		               
		               	pointInterval: 17 * 60 * 15,
		                pointStart: Date.UTC(2018, 5, 28, 14, 30),
		                pointEnd: Date.UTC(2018, 5, 29, 09, 30),
		                tooltip: {
		                    valueSuffix: ' '
		                }

		            },
		            {
		            	name: 'y값 이동거리',
		                type: 'spline',
		               
		                data: data.yList2,		               		               
		               	pointInterval: 17 * 60 * 15,
		                pointStart: Date.UTC(2018, 5, 28, 14, 30),
		                pointEnd: Date.UTC(2018, 5, 29, 09, 30),
		                tooltip: {
		                    valueSuffix: ' '
		                }

		            },
		            {
		            	name: 'z값 가속도',
		                type: 'spline',
		               
		                data: data.zList,		               		               
		               	pointInterval: 17 * 60 * 15,
		                pointStart: Date.UTC(2018, 5, 28, 14, 30),
		                pointEnd: Date.UTC(2018, 5, 29, 09, 30),
		                tooltip: {
		                    valueSuffix: ' '
		                }

		            },
		            {
		            	name: 'z값 이동거리',
		                type: 'spline',		               
		                data: data.zList2,		               		               
		               	pointInterval: 17 * 60 * 15,
		                pointStart: Date.UTC(2018, 5, 28, 14, 30),
		                pointEnd: Date.UTC(2018, 5, 29, 09, 30),
		                tooltip: {
		                    valueSuffix: ' '
		                }

		            } */
		            ]
		        });
				$('#ssList').css('display','none');
				$('#container').slideDown();
				/* console.log(data.xList)
				
				
				var option = {};
				option.chart = {renderTo:'container',zoomType:'x'};
				option.title = {text:'이동거리(센싱데이터)'};
				option.xAxis = {categories:categories};
				option.yAxis = {
					title:{text:'이동거리(가속도)'},
					plotLines: [{value: 0, width: 1, color: '#808080'}]
				};
				option.legend = {
					enabled:true,
					backgroundColor: '#FFFFFF',
					maxHeight: 150,
					itemMarginBottom: 1,
					shadow: true,
					align: 'right',
					verticalAlign: 'top',
					y : 24,
					itemStyle: {
						fontWeight: ''
					}	
				};
				option.series = [
					{name:'가속도',data:data.xList},
					{name:'이동거리',data:data.xList2}
				];
				option.scrollbar= {enabled:true};
				$('#container').highcharts(option) */
				/* Highcharts.Chart(option)  */
			}
		})
	}
	</script>

	<style>
	#content .buttons-print {
		margin-left: 7px !important;
		border: 2px  solid #ccc !important;
    }    
	</style>

<!-- 본문 -->	
<div class="loader" style="display:none;">
	<img src="resources/img/2.gif" alt="loading">
</div>

<div id="container" style="height:600px;display:none;"></div>
<!-- <div id="ssChart" style="display:none;">h2</div> -->
<div id="ssList">
	<div id="buttonWrap">
		<!-- <input type="date" id="targetDate" class="form-control" />
		<input type="text" class="form-control" id="start" placeholder="시작시간"/> ~ 
		<input type="text" class="form-control" id="end" placeholder="종료시간"/> -->
		<input class="btn btn-success buttons-excel buttons-html5"  type="button" style="width:150px !important" value="활동량그래프" onclick="moveMeterCal()">
		<div id="distanceDiv">
	
		</div>
	</div>	
	
	<div id="content">
		<table id="payList">
			<colgroup>
				<col width="50px">
				<col width="70px">
				<col width="70px">
				<col width="170px">
				<col width="50px">
				<col width="50px">
				<col width="50px">
				<col width="50px">
				<col width="50px">
				<col width="50px">
				<col width="50px">
				<col width="50px">
				<col width="50px">
				<col width="50px">
				<col width="50px">
			</colgroup>
            <thead>
            	<tr>
                	<th rowspan="2">NO</th>
                    <th rowspan="2">목장명</th>
                    <th rowspan="2">축사ID</th>
                    <th>업데이트</th>
                    <th colspan="3">가속도센서(g-중력가속도)</th>
                    <th  colspan="3">자이로센서(degress/s)</th>
                    <th  colspan="3">지자기센서</th>
                    <th rowspan="2">온도</th>
                    <th rowspan="2">활동</th>
                </tr>
                <tr>
	                <th>2017-09</th>
	                <th>g_Ax</th>
	                <th>g_Ay</th>
	                <th>g_Az</th>
	                <th>g_Gx</th>
	                <th>g_Gy</th>
	                <th>g_Gz</th>
	                <th>g_Mx</th>
	                <th>g_My</th>
	                <th>g_Mz</th>
	            </tr>
			</thead>
			
            <tbody>
                
            </tbody>
		</table>
    </div>
</div>

<c:import url="../../module/footer.jsp"></c:import>