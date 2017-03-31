
<%@ include file="Up.jsp" %>
<%@ include file="Sidebar_Project.jsp" %>

<!-- START CONTENT -->


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

                        <form name="SearchProjects" method="post" action="#" enctype="multipart/form-data">
                            <div class="col-md-3 col-sm-3 col-xs-3">
                                <span class="bold">Manager SD :</span>
                                <select class="form-control input-sm m-bot15">
                                    <option>All</option>
                                    <option>Kamal</option>
                                    <option>Piyal</option>
                                </select></div>
                            <div class="col-md-1 col-sm-1 col-xs-1"></div>
                            <div class="col-md-3 col-sm-3 col-xs-3">
                                <span class="bold">Project Manager :</span>
                                <select class="form-control input-sm m-bot15">
                                    <option>All</option>
                                    <option>Kamal</option>
                                    <option>Piyal</option>
                                </select></div>
                            <div class="col-md-1 col-sm-1 col-xs-1"></div>
                            <div class="col-md-3 col-sm-3 col-xs-3">
                                <span class="bold">Business Analyst :</span>
                                <select class="form-control input-sm m-bot15">
                                    <option>All</option>
                                    <option>Kamal</option>
                                    <option>Piyal</option>
                                </select></div>

                            <br/><br/><br/><br/>

                            <div class="row">
                                <div class="col-md-1 col-sm-1 col-xs-1"></div>
                                <div class="col-md-4 col-sm-4 col-xs-4">
                                    <div class="form-group">
                                        <label class="form-label" for="daterange-1"><span class="bold">Date Range :</span></label>
                                        <div class="controls">
                                            <input type="text" id="daterange-1" class="form-control daterange">
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-1 col-sm-1 col-xs-1"></div>
                                <div class="col-md-4 col-sm-4 col-xs-4">
                                    <label class="form-label"><span class="bold">Status :</span></label>
                                    <select class="form-control input-sm m-bot15">
                                        <option>All</option>
                                        <option>Approved</option>
                                        <option>Reject</option>
                                        <option>Ongoing</option>
                                    </select>
                                </div>

                            </div>
                            <center><input class="btn btn-warning" type="submit" value="Search"></br></center>
                        </form>  

                        </section>
                        <section class="box ">

                            <div class="content-body">    
                                <div class="row">
                                    <div class="col-md-12 col-sm-12 col-xs-12">

                                        <table class="table table-striped">
                                            <thead>
                                                <tr>
                                                    <th>No</th>
                                                    <th>Project Name</th>
                                                    <th>Status</th>
                                                    <th>Created Date</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <tr>
                                                    <th scope="row">1</th>
                                                    <td>Sampath Vishwa</td>
                                                    <td>Ongoing</td>
                                                    <td>Mar 28 2017</td>
                                                </tr>
                                                <tr>
                                                    <th scope="row">2</th>
                                                    <td>Sampath SmartGen</td>
                                                    <td>Approved</td>
                                                    <td>Jan 17 2017</td>
                                                </tr>
                                                <tr>
                                                    <th scope="row">3</th>
                                                    <td>Sampath Infinity</td>
                                                    <td>Reject</td>
                                                    <td>Feb 23 2016</td>
                                                </tr>
                                            </tbody>
                                        </table>

                                    </div>
                                </div>
                        </section>
                    </div>

            </section>
    </section>






<%@ include file="Down.jsp" %>