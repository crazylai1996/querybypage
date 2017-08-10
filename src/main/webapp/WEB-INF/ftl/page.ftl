<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<style>
	.current{
		text-decoration:none;
		color:red;
	}
</style>
</head>
<body>
<h2>分页查询</h2>
<#list page.items>
	<ul>
	<#items as item>
		<li>${item.id}.${item.item}</li>
	</#items>
	</ul>
</#list>
<#if page.totalCount !=0>
	<a href="
		<#if page.current != 1>
			${request.contextPath}/items/page/${page.current-1}
		<#else>
			#
		</#if>
		">上一页</a>
	<#assign start = 1>
	<!--尾页数<=5-->
	<#if page.end lte 5>
		<#list start..page.end as p>
			<a class="<#if page.current == p>current</#if>" href="${request.contextPath}/items/page/${p}">${p}</a>
		</#list>
	<#else>
		<#assign start = 1 + 4 * ((page.current/4)?ceiling - 1)>
		<#if page.end - start gt 4>
			<#list start..*5 as p>
				<a class="<#if page.current == p>current</#if>" href="${request.contextPath}/items/page/${p}">${p}</a>
			</#list>
			<a href="#">...</a>
			<a href="${request.contextPath}/items/page/${page.end}">${page.end}</a>
		<#else>
			<a href="#">...</a>
			<#list start..page.end as p>
				<a class="<#if page.current == p>current</#if>" href="${request.contextPath}/items/page/${p}">${p}</a>
			</#list>
		</#if>
	</#if>
	<a href="
		<#if page.current != page.end>
			${request.contextPath}/items/page/${page.current+1}
		<#else>
			#
		</#if>
	">下一页</a>
</#if>
</body>
</html>
