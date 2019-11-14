<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>

<body>
<h1>Struts 2 drop down box example</h1>

<s:form action="selectList" namespace="/">

<h2>
	<s:select label="What's your flavor" 
		headerKey="-1" headerValue="Select Flavor"
		list="flavors" 
		name="flavor" 
		listKey="id" 
		listValue="name" />
</h2> 


<s:submit value="submit" name="submit" />
	
</s:form>

</body>
</html>
