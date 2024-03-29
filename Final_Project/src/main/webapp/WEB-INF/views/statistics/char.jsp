<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="/WEB-INF/views/include/top.jsp"/>
<div class="container pt-3">
    <div id="chart_div" style="width: 100%; height: 500px;"></div>
</div>
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
        google.charts.load('current', {'packages':['corechart']});
        google.charts.setOnLoadCallback(drawChart);

        function drawChart() {
            $.ajax({
                url: "/statistics/message/data",
                success: function (response) {
                    console.log('response :>> ', response);
                    var data = google.visualization.arrayToDataTable(response);  
                    var options = {
                        title: 'Company Performance',
                        hAxis: {title: 'hour',  titleTextStyle: {color: '#333'}},
                        vAxis: {title: 'count',  titleTextStyle: {color: '#333'}},
                    };

                    var chart = new google.visualization.AreaChart(document.getElementById('chart_div'));
                    chart.draw(data, options);          
                }
            });
      }
    </script>
<jsp:include page="/WEB-INF/views/include/bottom.jsp"/>