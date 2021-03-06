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
		        
				         
				<!--         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.css" > -->
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
							
							
						var 	 varfarmId ="001"; 
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
				   
				      "url":"${pageContext.request.contextPath }/ajax/envEntityList",
				      "type":"POST",
				      "data" : { FARM_ID :  "${farmId}" },
				      "dataSrc": function(json){
				    	   console.log("======");  
				    	   console.log(json);
				    	   var farmlist = json.envList;
				    	   if (json == 'null') {alert();}
				    	   if (json != 'null') {
				    		   
				    		   console.log("===ok==");  
				    		   console.log(farmlist.length);  
				            
				    		   for(var i=0; i<farmlist.length; i++){
				    		 
				    			    // 축사 청결상태  
				    			  if(farmlist[i].clean=="1"){ farmlist[i].clean="매우불량"}
				    			  else   if(farmlist[i].clean=="2"){ farmlist[i].clean="불량"}
				    			  else   if(farmlist[i].clean=="3"){ farmlist[i].clean="보통"}
				    			  else   if(farmlist[i].clean=="4"){ farmlist[i].clean="양호"}
				    			  else   if(farmlist[i].clean=="4"){ farmlist[i].clean="매우 양호"}
				    			  // 급수조 청결상태  
				    			  if(farmlist[i].wtc=="1"){ farmlist[i].wtc="매우불량"}
				    			  else   if(farmlist[i].wtc=="2"){ farmlist[i].wtc="불량"}
				    			  else   if(farmlist[i].wtc=="3"){ farmlist[i].wtc="보통"}
				    			  else   if(farmlist[i].wtc=="4"){ farmlist[i].wtc="양호"}
				    			  else   if(farmlist[i].wtc=="4"){ farmlist[i].wtc="매우 양호"}
								
				    			  if( farmlist[i].colostrum=="1"){ farmlist[i].colostrum="Yes"}
				        		   else if( farmlist[i].colostrum=="2"){ farmlist[i].colostrum="No"}
				        		   else{ farmlist[i].colostrum="-"}
				        		      if( farmlist[i].vaccine=="1"){ farmlist[i].vaccine="Yes"}
				           		   else if( farmlist[i].vaccine=="2"){ farmlist[i].vaccine="No"}
				           		   else{ farmlist[i].vaccine="-"}
				    			  
				    			  
				    			  
				    			   //핸드폰번호 조합하여 phone1에 넣게
				    			   if(farmlist[i].phone1=="null"){ farmlist[i].phone1=""   }
				    			   if(farmlist[i].phone2=="null"){ farmlist[i].phone2=""   }
				    			   if(farmlist[i].phone3=="null"){ farmlist[i].phone3=""   }
				    			   if(farmlist[i].phone1==null){ farmlist[i].phone1=""   }
				    			   if(farmlist[i].phone2==null){ farmlist[i].phone2=""   }
				    			   if(farmlist[i].phone3==null){ farmlist[i].phone3=""   }
				    			   
				    			   console.log(farmlist[i].phone1);  
						   	        	
				 		   	        	farmlist[i].phone1 = farmlist[i].phone1+"-" +farmlist[i].phone2+"-" +farmlist[i].phone3 ;
				 
						   	             
						   	             
						   	     
						   	    	   
						   	       //일반번호 조합하여 hp1에 넣기
				 		   	        if(farmlist[i].hp1=="null"){ farmlist[i].hp1=""   }
				     			   if(farmlist[i].hp2=="null"){ farmlist[i].hp2=""   }
				     			   if(farmlist[i].hp3=="null"){ farmlist[i].hp3=""   }
				     			   if(farmlist[i].hp1==null){ farmlist[i].hp1=""   }
				     			   if(farmlist[i].hp2==null){ farmlist[i].hp2=""   }
				     			   if(farmlist[i].hp3==null){ farmlist[i].hp3=""   }
				     			   
				     			   

					   	        	
					   	        	farmlist[i].hp1 = farmlist[i].hp1+"-" +farmlist[i].hp2+"-" +farmlist[i].hp3 ;

				     			   
						   	    	   
						   	       //보기 버튼 만들기	
						   	       // phone2에 지도보기버튼 추가
						   	      	farmlist[i].phone2 =" 	<div align='center'><a href='envEntityUpdate?farmId=${farmId }&seqno="+farmlist[i].seqno+"'><input type='button' value='수정'></a></div>";
						   	    	   
						            //수정 버튼만들기
						   	    	  //phone3에 수정버튼 추가
						   	    	  
						   	    	     // 	farmlist[i].phone3 =" <div align='center'><a href='envEntityList?farmId="+farmlist[i].farmId+"'><input type='button' value=' 수정'></a></div>";
						   	    	  
						   	    	  
						   	    	   
//						   	     	   		<div align="center">
//						   	 										<input type="button" value="보기">
//						   	 									</div>
//						   	 								</td>
//						   	 								<td style="font-size: 13px;">
//						   	 									<div align="center">
//						   	 										<a href="farmUpdate?farmId=${list.farmId }"><input type="button" value="수정"></a>
//						   	 									</div>
						   	    	 
				   	          }
				    		   
				    	   }
				    	   //핸드폰번호 조합하여 phone1에 넣게
				    	   
				    	   //일반번호 조합하여 hp1에 넣기
				    	   
				    	   
				    //보기 버튼 만들기	   
				    	   
				    	   //수정 버튼만들기
//				     	   		<div align="center"><input type="button" value="보기"></div>
//				 							
//				 									<div align="center"><a href="farmUpdate?farmId=${list.farmId }"><input type="button" value="수정"></a></div>
				    	   
				    	   
//				         if (json.data != 'null') {
				       
//				          for(var i=0; i<json.length; i++){
//				          if( json[i].corpSttus == 'D'){
//				            json[i].corpSttus = '이용 중지'
//				          } else{
//				           json[i].corpSttus  = '이용중'
//				          }
//				          json[i].pageIndex = i+1;
				         
//				          }
				         
//				          return json;
//				          }
				return json.envList
				      }
				  },            
				  columns : [
				      {data: "rnum", sClass:"counNo"},
				      {data: "farm_ID"},
				      {data: "env_GATHERDATE"},
				      {data: "clean"},
				      {data: "wtc"},
				      {data: "wsq"},      
				      {data: "fq"},
				      {data: "inputdate"},
				      {data: "updatedate"},				 
				      {data: "phone2"}
				      
				  ],
				         initComplete : function() {
				 
				        	 
				        	 
				        	 $('#payList_filter').prepend( $('#buttonWrap')) ;
				        	 
				         }
				  
				  
				  
				  //=============
				   });      
				      
				       
				});

				 
						
				</script><style>
      #content  .buttons-print {
    margin-left: 7px !important;
  border: 2px  solid #ccc !important;
            }    
</style>
				 <div id="buttonWrap">
<!-- 							 <input  class="btn btn-default buttons-excel buttons-html5" type="button" value="인쇄" onClick="print(document.getElementById('payList').innerHTML)"> -->
							  
			 			 <input  class="btn btn-default buttons-excel buttons-html5"  type="button" value="추가" onclick="location.href='envEntityInsert?farmId=${farmId }'"> 
								  
				</div>	
					<div id="content">
					<table id="payList">
				                   <colgroup>
				                        <col width="100px">
				                          <col width="100px">
				                            <col width="150px">
				                              <col width="150px">
				               
				                        <col width="100px">
				                        <col width="100px">
				                        <col width="100px">
				                            <col width="70px">
				                        <col width="70px">
				                        <col width="70px">
				                            <col width="70px">
				                        <col width="70px">
				                    </colgroup>
				                    <thead>
				                     <tr>
				                         <th>
				                             NO   
				                         </th>
				                         <th>
				                             목장번호
				                         </th>
				                         <th>
				                             환경조사일
				                         </th>
				                         <th>
				                             축사청결
				                         </th>
				                         <th>
				                            급수조청결
				                         </th>
				                         
				                            <th>
				                             급수수질
				                         </th>
				                         <th>
				                             조사료/종류
				                         </th>
				                         <th>
				                             입력일자
				                         </th>
				                          <th>
				                             수정일자
				                         </th>
				                          <th>
				                             환경수정
				                         </th>
				                            
				                        </tr>
				                    </thead>
				                    <tbody>
				                        
				                    </tbody>
				                </table>
				    	</div>
				







				<c:import url="../../module/footer.jsp"></c:import>
				 

