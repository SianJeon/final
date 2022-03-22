<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



<script>
	var serverName = location.host;
	var ws = new WebSocket("ws://"+serverName +"/ws/alert");
	
	ws.onmessage = function(recv) {
		console.log(recv.data);
	}

</script>
</body>
</html>
