
<%@ include file="Up.jsp" %>
<%@ include file="Sidebar.jsp" %>

<!-- START CONTENT -->
<% 
            ArrayList<Employee> emp=Employee.getEmployee();
            Employee em;
%>

<section id="main-content" class=" ">
    <section class="wrapper" style='margin-top:50px;display:inline-block;width:100%;padding:15px 0 0 15px;'>

        <div class="clearfix"></div>
        <div class="col-lg-12">
            <section class="box ">
                <header class="panel_header">
                    <h2 class="title pull-left">Search Projects</h2>
                </header>
                <div class="content-body">    
                    <div class="row">

                        <form name="SearchProjects" method="post" action="Project_Summary_Results.jsp">
                            <div class="col-md-3 col-sm-3 col-xs-3">
                                <span class="bold">Manager SD :</span>
                                <select name="msd" class="form-control input-sm m-bot15">
                                    <option value="all">All</option>
                                    <%
                                        for(int x=0;x<emp.size();x++){
                                        em=emp.get(x);
                                        if(em.getPosition().equals("PM/MSD") || em.getPosition().equals("ManagerSD") ){
                                        
                                    %>
                                    <option value="<% out.print(em.getEmployeeid()); %>"><% out.print(em.getEmployeename()); %> ( <% out.print(em.getDepartement()); %> )</option>
                                    <%
                                        }
                                       }
                                    %>
                                </select></div>
                            <div class="col-md-1 col-sm-1 col-xs-1"></div>
                            <div class="col-md-3 col-sm-3 col-xs-3">
                                <span class="bold">Project Manager :</span>
                                <select name="pm" class="form-control input-sm m-bot15">
                                    <option value="all">All</option>
                                    <%
                                        for(int x=0;x<emp.size();x++){
                                        em=emp.get(x);
                                        if(em.getPosition().equals("PM/MSD") || em.getPosition().equals("Project Manager") ){
                                        
                                    %>
                                    <option value="<% out.print(em.getEmployeeid()); %>"><% out.print(em.getEmployeename()); %> ( <% out.print(em.getDepartement()); %> )</option>
                                    <%
                                        }
                                       }
                                    %>
                                </select></div>
                            <div class="col-md-1 col-sm-1 col-xs-1"></div>
                            <div class="col-md-3 col-sm-3 col-xs-3">
                                <span class="bold">Business Analyst :</span>
                                <select name="ba" class="form-control input-sm m-bot15">
                                    <option value="all">All</option>
                                    <%
                                        for(int x=0;x<emp.size();x++){
                                        em=emp.get(x);
                                        if(em.getPosition().equals("Business Analyist") ){
                                        
                                    %>
                                    <option value="<% out.print(em.getEmployeeid()); %>"><% out.print(em.getEmployeename()); %> ( <% out.print(em.getDepartement()); %> )</option>
                                    <%
                                        }
                                       }
                                    %>
                                </select></div>

                            <br/><br/><br/><br/>

                            <div class="row">
                                <div class="col-md-1 col-sm-1 col-xs-1"></div>
                                <div class="col-md-4 col-sm-4 col-xs-4">
                                    <div class="form-group">
                                        <label class="form-label" for="daterange-1"><span class="bold">Date Range :</span></label>
                                        <div class="controls">
                                            <input type="text" name="drange" id="daterange-1" class="form-control daterange" required>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-1 col-sm-1 col-xs-1"></div>
                                <div class="col-md-4 col-sm-4 col-xs-4">
                                    <label class="form-label"><span class="bold">Status :</span></label>
                                    <select name="status" class="form-control input-sm m-bot15">
                                        <option value="all">All</option>
                                        <option value="approved">Approved</option>
                                        <option value="rejected">Reject</option>
                                        <option value="ongoing">Ongoing</option>
                                    </select>
                                </div>

                            </div>
                            <center><input class="btn btn-warning" type="submit" value="Search"></br></center>
                        </form>  

                        </section>
                        
                    </div>

            </section>
    </section>






<%@ include file="Down.jsp" %>