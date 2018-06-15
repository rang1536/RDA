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

<script>
	$(document).ready(function(){
	    $("#searchValue").keydown(function (key) {
	        if(key.keyCode == 13){ //엔터키
	        	searchList();
	        }
	    });
	    $("#searchBtn").click(function (key) {
	        	searchList();
	    });
	});
	
	function searchList(){
		var searchOption = $('#searchOption').val();
		var searchValue = $('#searchValue').val();
		window.location.href = "farmList?searchOption="+searchOption+"&searchValue="+ encodeURI(searchValue);
	}
	
	
	
	
	//==============================================================
		
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
   
      "url":"${pageContext.request.contextPath }/ajax/senseCountList",
      "type":"POST",
      "dataSrc": function(json){
    	    console.log("======");  console.log(json);
    	  
			return json
		    }
  	},            
  columns : [
      {data: "day" },
      {data: "cow1"},
      {data: "cow2"},
      {data: "cow3"},
      {data: "cow4"},
      {data: "cow5"},      
      {data: "cow6"},
      {data: "cow7"},
      {data: "cow8"},
      {data: "cow9"},
      {data: "cow10"} 
      
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

</div>	

<h5>>개체별,일별 활동량 수집건수</h5>
<div id="content">
	<table id="payList">
		<colgroup>
			<col width="150px">
			<col width="70px">                           
			<col width="70px">
			<col width="70px">
			<col width="70px">
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
				<th>날짜</th>
				<th>1번 소</th>
				<th>2번 소</th>
				<th>3번 소</th>
				<th>4번 소</th>
				<th>5번 소</th>
				<th>6번 소</th>
				<th>7번 소</th>
				<th>8번 소</th>
				<th>9번 소</th>
				<th>10번 소</th>
			</tr>
		</thead>
		<tbody>
		    
		</tbody>
	</table>
</div>
 
<c:import url="../../module/footer.jsp"></c:import>