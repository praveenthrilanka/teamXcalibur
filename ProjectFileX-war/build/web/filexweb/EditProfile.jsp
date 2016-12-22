<%@ include file="Up.jsp" %>

            <div id="page-wrapper">
			
				<div class="login-form">
					<h4>Edit Your Profile</h4>
					<h5><strong></strong></h5>


					<form>
						<div style="display:block; margin:auto; width:30%;">
							<img src="logos/user.png" id="output" width="130" height="130"/>
						</div>
						<br/>
						<div style="display:block; margin:auto; width:45%;">
							<input type="file" accept="image/*" onchange="loadFile(event)" required>
							
						</div>
						<script>
						  var loadFile = function(event) {
						    var output = document.getElementById('output');
						    output.src = URL.createObjectURL(event.target.files[0]);
						  };
						</script>
					    <br/><br/>
						<input type="text" id="newname" placeholder="Enter your name here" required>

						<br/><br/><br/>

						<div class="clearfix"></div>
						<button style="background-color:#FF9D26; border:none;" class="btn btn-info btn-block" type="submit"><strong>Set</strong></button>
						<input style="background-color:FFC682; border:none;" class="btn btn-info btn-block" type="reset" id="reset">
						<br/>
					</form>
				</div>
			
	</div>

<%@ include file="Down.jsp" %>