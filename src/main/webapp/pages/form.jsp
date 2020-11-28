<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.20/css/jquery.dataTables.min.css"/> 
<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"></script>
 </head>

 <h1>Hi Welcome to Fuse Mapper</h1>
 

<body>
<h1> ${cpList} </h1>
<script type="text/javascript">
$(document).ready(function(){
	alert("hi");
	var data1= '${cpList}';
	// var data= data.substring(1, data1.length - 1);
	 //var data = JSON.stringify(${cpList});
	 //console.log(data);
    //var data2 = JSON.parse(data1); 
    var data=jQuery.parseJSON(data1);
     //var data=data1;
    
	

var table = $('#example').DataTable( {

     "pageLength" : 20,   
     
	"ajax":{
        url: '../ajaxcp',
        type: "post",
        dataType: 'json'
                
   },
   "aaData": data,
	"aoColumns": [
		
		{ "mData": "aliasId"},
		{ "mData": "entityTypeName"},
		{ "mData": "upStreamApp"},
		{ "mData": "companyName"},
		{ "mData": "upStreamAlias"},
		{ "mData": "downStreamApp"},
		{ "mData": "downStreamAlias"},
		{ "mData": "instrumentName" },
		{ "mData": "instrumentId"}
	]
	

	

});

});
</script>   

 <table id="example" class="display" cellspacing="0" width="50%" style="overflow-x:auto">
<thead>
<tr>
<th>alias_id</th>
<th>EntityType</th>
<th>UpStreamapp</th>
<th>Entity</th>
<th>UpStreamalias</th>
<th>UpStreamapp</th>
<th>downstreamapp</th>
<th>downstreamalias</th>
<th>instrument_Id</th>
<th>instrument_name</th>
</tr>
</thead>
</table>


 <form action="addCP"  name="Create Alias">
 <fieldset  style="width:30px;float: right">
 <legend rows="3" cols="60">Create Alias</legend> 
 
<p>EntityType: <input type="text" size="30" name="entity_type_name"/></p>
<p>UpStreamapp: <input type="text" size="30" name="upstream_app"/></p>
<p>Entity: <input type="text" size="30" name="company_name"/></p>
<p>UpStreamalias: <input type="text" size="30" name="upstream_alias"/></p>
<p>downstreamapp: <input type="text" size="30" name="downstream_app"/></p>
<p>downstreamalias: <input type="text" size="30" name="downstream_alias"/></p>

 <input type="submit"  name='submit'>
</fieldset> 
</form> 
</body>
</html>