<html>
<head>
  <title>Welcome!</title>
</head>
<body>
  <h1>Welcome ${user}!</h1>
  <p>Our latest product:
  <a href="${latestProduct.url}">${latestProduct.name}</a>!
</body>
</html>

<#assign x = "something">
${indexOfOf("met", x)}
${indexOfOf("foo", x)}

aaa
<@upper>
  ccc
  <#-- All kind of FTL is allowed here -->
  <#list ["red", "green", "blue"] as color>
    ${color}
  </#list>
  ddd
</@upper>
bbb