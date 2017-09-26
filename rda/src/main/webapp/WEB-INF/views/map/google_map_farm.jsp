<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>구글맵 목장 마커</title>

<script type="text/javascript" src="https://code.jquery.com/jquery-2.2.4.js"></script>

	<style type="text/css">
		html, body { width:100%; height:100%;  margin:0px; padding:0px; overflow:hidden; }
		#map { width:100%; height:auto; border:0px; align:center; margin:-10px -10px -10px -5px; }
		a:link     {color:black;text-decoration:none} 
		a:visited  {color:black;text-decoration:none} 
		a:active   {color:black;text-decoration:none} 
		a:hover    {color:black;text-decoration:none}
	</style>
	<script type="text/javascript">

		$(function(){
			$("#map").height($(window).height());  // 처음로드시 크기설정
				$( window ).resize(function() {  // 창크기수정시 크기 다시설정
				$("#map").height($(window).height());
			});
		});
	</script>


</head>
<body>
<c:import url="../module/top_menu.jsp"></c:import>
<c:import url="../module/side_data_management.jsp"></c:import>

	
<div style="width:100%;height:30px;">
	<input type="button" value="경기" onclick="add_marker(35.8241587,127.1480505,'경기')"/>
	<input type="button" value="강원" onclick="add_marker(35.8241587,127.1480505,'강원')"/>
	<input type="button" value="경북" onclick="add_marker(35.8241587,127.1480505,'경북')"/>
	<input type="button" value="경남" onclick="add_marker(35.8241587,127.1480505,'경남')"/>
	<input type="button" value="충북" onclick="add_marker(35.8241587,127.1480505,'충북')"/>
	<input type="button" value="충남" onclick="add_marker(35.8241587,127.1480505,'충남')"/>
	<input type="button" value="전북" onclick="add_marker(35.8241587,127.1480505,'강원')"/>
	<input type="button" value="전남" onclick="add_marker(35.8241587,127.1480505,'전남')"/>
	<input type="button" value="제주" onclick="add_marker(35.8241587,127.1480505,'제주')"/>
</div>	
<div id="map" style="width:100%;"></div>
    <script>
    var lat = 35.8241587;
    var lng = 127.1480505;
    var zoom = 10;
    var local = "전북";
    
    //var marker;
    var markers = new Array();
    var infowindow;
    
   // alert(lat+lng);
	
	//add_my_marker(getParam("pid"));
	add_marker(lat,lng, local);

 	function add_marker(lat, lng, local){
		//alert(s+lat+lng);.
		$.ajax({
			url:"markerMap",
			data: {'farmDo':local},
		    type:'POST',
		    dataType:'json',
		    success:function(data){	
		    	
		    	/* $.each(data, function(i, farmList){
		    		map_add_marker(farmList);
		    		console.log(farmList);
		    	}) */
		    	for(var i=0; i<data.length; i++){
		    		map_add_marker(data[i]);
		    	}
		    	       	
		    },
		        error:function(jqXHR, textStatus, errorThrown){	
		        	alert('실패');
		    }
		});
	}
   	
   	function map_add_marker(farmList){
   	   var marker = new google.maps.Marker({
			position: new google.maps.LatLng(farmList.farmLat, farmList.farmLng),
			map: map,
			icon : new google.maps.MarkerImage('http://bestpoll.kr/image/icon/map/marker/10.png', null, null, null, new google.maps.Size(12,12)),
			title : farmList.farmName,
		//	zIndex : i
		});
			
			//markers.push(marker);
			//alert(i);
			//alert(marker.zIndex);
			
			
			 //alert(i);
	   	var content = '<div id="content">'+
			'<div id="siteNotice">'+
			'</div>'+
			'<h3 id="firstHeading" class="firstHeading">'+farmList.farmName+'</h3>'+
			'<div id="bodyContent">'+
			'<h4>사육품목 : '+farmList.farmEntity
			'</h4></div>'+
			'</div>';
		
		google.maps.event.addListener(marker, "click", function() {
			//alert('click');
			if (infowindow){
				infowindow.close();
			}
			infowindow = new google.maps.InfoWindow({ content: content});;
			map.setCenter(marker.getPosition());
	   		infowindow.open(map,marker);
		});
		
   	}
   	
   	var map;
	function initMap() {
		map = new google.maps.Map(document.getElementById('map'), {
			center: new google.maps.LatLng(lat,lng), // 지도 중앙 위치,
			zoom: zoom
		});
	}

    </script>
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCsic8Yvohe0ojR_ghiC2su6ja9JnZC7eI&callback=initMap" async defer></script>
 
  
<c:import url="../module/footer.jsp"></c:import>
</body>

</html>