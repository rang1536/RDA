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
	   
	<style>
	table thead tr th.sorting {
	    padding-left: 1px !important;
	    padding-right: 1px !important;
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
	
	
	</script>

	<style>
	#content .buttons-print {
		margin-left: 7px !important;
		border: 2px  solid #ccc !important;
    }    
	</style>

<!-- 본문 -->	
	<div id="buttonWrap">
	
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
 

<c:import url="../../module/footer.jsp"></c:import>