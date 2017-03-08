<%@ include file="Up.jsp" %>
<%@ include file="Sidebar_Project.jsp" %>
                    
            <!-- START CONTENT -->
            <section id="main-content" class=" ">
                <section class="wrapper" style='margin-top:50px;display:inline-block;width:100%;padding:15px 0 0 15px;'>
				<div class="login-form" style ="">
					<h4>Upload SRS</h4>

                        <%   
                        String srsversion=Project.getSRSVersion(pno);
                        if(srsversion==null)
                        {
                        %>
                        
                        <form name="EditProfile" method="post" action="../UploadSRS" enctype="multipart/form-data">

                        <!--<label>SRS ID:</label><input type="text" name="srsid" placeholder="Enter SRS ID" required> <br/><br/>-->
                             <!-- <label>SRS Version:</label><input type="text" name="srs-version" placeholder="Enter SRS Version" required> -->             
                                <br/><br/><br/>
                                    <div style="display:block; margin:auto; width:30%;">
							<img src="images/upload.png" id="output" width="130" height="130"/>
						</div>
						<br/>
						<div style="display:block; margin:auto; width:45%;">
							<input type="file" name="srs"  onchange="loadFile(event)" required/>
							
						</div>
						
					    <br/><br/><br/>

						<div class="clearfix"></div>
                                                <input type="hidden" name="srsversion" value=""/>
						<input style="background-color:#FF9D26; border:none;" class="btn btn-info btn-block" type="submit" value="Upload SRS">
					</form>
                        <%
                        }
                        else
                        {        
                        %>
                        
                        <form name="EditProfile" method="post" action="../UploadSRS" enctype="multipart/form-data">

                        <!--<label>SRS ID:</label><input type="text" name="srsid" placeholder="Enter SRS ID" required> <br/><br/>-->
                        <label>SRS Version : <% out.print(Integer.parseInt(srsversion)+1); %></label>              
                                <br/>
                                <label>Changes Made:</label>
                                <input type="text" name="changes" placeholder="Enter Changes" required> <br/><br/>
                                                <div style="display:block; margin:auto; width:30%;">
							<img src="images/upload.png" id="output" width="130" height="130"/>
						</div>
						<br/>
						<div style="display:block; margin:auto; width:45%;">
							<input type="file" name="srs"  onchange="loadFile(event)" required/>
							
						</div>
						
                                                <br/><br/><br/>

						<div class="clearfix"></div>
                                                <input type="hidden" name="srsversion" value="<% out.print(Integer.parseInt(srsversion)+1); %>"/>
						<input style="background-color:#FF9D26; border:none;" class="btn btn-info btn-block" type="submit" value="Upload SRS">
					</form>
                                    
                        <% } %>
                        
                        
                        
                        
				</div>
			
                                            
                        <script>
						  var loadFile = function(event) {
						    var output = document.getElementById('output');
						    output.src = URL.createObjectURL(event.target.files[0]);
						  };
			</script>
                </section></section>>

<%@ include file="Down.jsp" %>