<%--
  Created by IntelliJ IDEA.
  User: bostasze
  Date: 3/7/20
  Time: 11:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="Servlet">
    <input type="number" min="0" max="99" step="1" value="10" name="value1" required>
    <input type="number" min="0" max="99" step="1" value="10" name="value2" required>
    <select name="operation">
      <option value="+">Dodaj</option>
      <option value="-">Odejmij</option>
      <option value="*">Pomnoz</option>
      <option value="/">Podziel</option>
    </select>
    <input type="submit" value="Count">
  </form>
  </body>
</html>
