<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:import url="../../module/top_menu.jsp"></c:import>
<c:import url="../../module/side_menu2.jsp"></c:import>

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

<script>
	$(document).ready(function(){
   		var table = 
        $('#payList').DataTable( {
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
   
      "url":"${pageContext.request.contextPath }/ajax/basicEntityList?sensedevtipe=1",
      "type":"POST",
      "dataSrc": function(json){
    	   var farmlist = json.ajaxList;
    	   if (json.farmList != 'null') {
    		   for(var i=0; i<farmlist.length; i++){
					farmlist[i].temmax1 =  farmlist[i].temmin1 +" ~ "+  farmlist[i].temmax1;
					
					farmlist[i].farmNm = "목장";
		   	    	   
		   	       	//보기 버튼 만들기	
		   	       	// 데이터 보기버튼 추가
		   	      	farmlist[i].phone2 ="<div align='center'><a href='senseEntityListDetail?sensecuid="+farmlist[i].sensecuid+"&sensenodeid="+farmlist[i].sensenodeid+"'><input type='button' value='보기'></a></div>";
		   	    	
		   	    	//phone3에 분석버튼 추가
		   	    	farmlist[i].phone3 ="<div align='center'><a href='basicActiveEntityChart?sensecuid="+farmlist[i].sensecuid+"&sensenodeid="+farmlist[i].sensenodeid+" '><input type='button' value='보기''></a></div>";
		   	    	  
   	          }
    		   
    	   }    	  
			return json.ajaxList
      	}
	  },            
	  columns : [
	      {data: "num", sClass:"counNo"},
	      {data: "farmNm"},
	      {data: "sensecuid"},
	      {data: "sensenodeid"},
	      {data: "sensedevtipe1"},
	      {data: "temmax1"},      
	      {data: "temc"},
	      {data: "temavr"},
	      {data: "tems"},
	      {data: "temmin"},
	      {data: "temmax"},
	      {data: "phone2"},
	      {data: "phone3"}
	      
	  ],
         initComplete : function() {
  
        	 $('#payList_filter').prepend( $('#buttonWrap')) ;
        	 
         } 
   });                
});
		
</script>
<style>
	#content  .buttons-print {
		margin-left: 7px !important;
		border: 2px  solid #ccc !important;
	}      
</style>

<div id="buttonWrap">
	<input  class="btn btn-success buttons-excel buttons-html5"  type="button" style="width:89px !important"value="활동량분석" onclick="location.href='basicActiveTotalChart'">				  
</div>	

<div id="content">
	<table id="payList">
		<colgroup>
			<col width="70px">
			<col width="100px">
			<col width="100px">
			<col width="100px">               
			<col width="100px">
			<col width="300px">
			<col width="70px">
			<col width="70px">
			<col width="70px">
			<col width="70px">
			<col width="70px">
			<col width="70px">
			<col width="70px">
		</colgroup>
		<thead>
			<tr>
				<th>NO</th>
				<th>목장명</th>
				<th>게이트웨이ID</th>
				<th>개체ID</th>
				<th>센서타입(활동량,체온)</th>
				<th>업데이트 최초 ~ 최근</th>
				<th>건수</th>
				<th>평균</th>
				<th>표준편차</th>
				<th>최소값</th>
				<th>최대값</th>
				<th>데이터</th>
				<th>분석</th>
			</tr>
		</thead>
		<tbody>
		    
		</tbody>
	</table>
</div>

<c:import url="../../module/footer.jsp"></c:import>