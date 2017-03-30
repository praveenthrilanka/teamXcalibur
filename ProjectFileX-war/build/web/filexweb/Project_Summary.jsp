
<%@ include file="Up.jsp" %>
<%@ include file="Sidebar_Project.jsp" %>

<!-- START CONTENT -->

<link href="css/stylesba.css" rel='stylesheet' type='text/css' />
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<link href="plugins/daterangepicker/css/daterangepicker-bs3.css" rel="stylesheet" type="text/css"/>
<script src="js/jquery-1.11.2.min.js"></script>

<script src="plugins/daterangepicker/js/daterangepicker.js"></script>



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

    <div class="daterangepicker dropdown-menu show-calendar opensright" style="top: 2027px; left: 121px; right: auto; display: block;"><div class="calendar first right"><div class="calendar-date"><table class="table-condensed"><thead><tr><th></th><th colspan="5" class="month">Mar 2017</th><th class="next available"><i class="fa fa-arrow-right icon icon-arrow-right glyphicon glyphicon-arrow-right"></i></th></tr><tr><th>Su</th><th>Mo</th><th>Tu</th><th>We</th><th>Th</th><th>Fr</th><th>Sa</th></tr></thead><tbody><tr><td class="off disabled" data-title="r0c0">26</td><td class="off disabled" data-title="r0c1">27</td><td class="off disabled" data-title="r0c2">28</td><td class="off disabled" data-title="r0c3">1</td><td class="off disabled" data-title="r0c4">2</td><td class="off disabled" data-title="r0c5">3</td><td class="off disabled" data-title="r0c6">4</td></tr><tr><td class="off disabled" data-title="r1c0">5</td><td class="off disabled" data-title="r1c1">6</td><td class="off disabled" data-title="r1c2">7</td><td class="off disabled" data-title="r1c3">8</td><td class="off disabled" data-title="r1c4">9</td><td class="off disabled" data-title="r1c5">10</td><td class="off disabled" data-title="r1c6">11</td></tr><tr><td class="off disabled" data-title="r2c0">12</td><td class="off disabled" data-title="r2c1">13</td><td class="off disabled" data-title="r2c2">14</td><td class="off disabled" data-title="r2c3">15</td><td class="off disabled" data-title="r2c4">16</td><td class="off disabled" data-title="r2c5">17</td><td class="off disabled" data-title="r2c6">18</td></tr><tr><td class="off disabled" data-title="r3c0">19</td><td class="off disabled" data-title="r3c1">20</td><td class="off disabled" data-title="r3c2">21</td><td class="off disabled" data-title="r3c3">22</td><td class="off disabled" data-title="r3c4">23</td><td class="off disabled" data-title="r3c5">24</td><td class="off disabled" data-title="r3c6">25</td></tr><tr><td class="off disabled" data-title="r4c0">26</td><td class="off disabled" data-title="r4c1">27</td><td class="off disabled" data-title="r4c2">28</td><td class="off disabled" data-title="r4c3">29</td><td class="available active start-date end-date" data-title="r4c4">30</td><td class="available" data-title="r4c5">31</td><td class="available off" data-title="r4c6">1</td></tr><tr><td class="available off" data-title="r5c0">2</td><td class="available off" data-title="r5c1">3</td><td class="available off" data-title="r5c2">4</td><td class="available off" data-title="r5c3">5</td><td class="available off" data-title="r5c4">6</td><td class="available off" data-title="r5c5">7</td><td class="available off" data-title="r5c6">8</td></tr></tbody></table></div></div><div class="calendar second left"><div class="calendar-date"><table class="table-condensed"><thead><tr><th class="prev available"><i class="fa fa-arrow-left icon icon-arrow-left glyphicon glyphicon-arrow-left"></i></th><th colspan="5" class="month">Mar 2017</th><th class="next available"><i class="fa fa-arrow-right icon icon-arrow-right glyphicon glyphicon-arrow-right"></i></th></tr><tr><th>Su</th><th>Mo</th><th>Tu</th><th>We</th><th>Th</th><th>Fr</th><th>Sa</th></tr></thead><tbody><tr><td class="available off" data-title="r0c0">26</td><td class="available off" data-title="r0c1">27</td><td class="available off" data-title="r0c2">28</td><td class="available" data-title="r0c3">1</td><td class="available" data-title="r0c4">2</td><td class="available" data-title="r0c5">3</td><td class="available" data-title="r0c6">4</td></tr><tr><td class="available" data-title="r1c0">5</td><td class="available" data-title="r1c1">6</td><td class="available" data-title="r1c2">7</td><td class="available" data-title="r1c3">8</td><td class="available" data-title="r1c4">9</td><td class="available" data-title="r1c5">10</td><td class="available" data-title="r1c6">11</td></tr><tr><td class="available" data-title="r2c0">12</td><td class="available" data-title="r2c1">13</td><td class="available" data-title="r2c2">14</td><td class="available" data-title="r2c3">15</td><td class="available" data-title="r2c4">16</td><td class="available" data-title="r2c5">17</td><td class="available" data-title="r2c6">18</td></tr><tr><td class="available" data-title="r3c0">19</td><td class="available" data-title="r3c1">20</td><td class="available" data-title="r3c2">21</td><td class="available" data-title="r3c3">22</td><td class="available" data-title="r3c4">23</td><td class="available" data-title="r3c5">24</td><td class="available" data-title="r3c6">25</td></tr><tr><td class="available" data-title="r4c0">26</td><td class="available" data-title="r4c1">27</td><td class="available" data-title="r4c2">28</td><td class="available" data-title="r4c3">29</td><td class="available active start-date end-date" data-title="r4c4">30</td><td class="available" data-title="r4c5">31</td><td class="available off" data-title="r4c6">1</td></tr><tr><td class="available off" data-title="r5c0">2</td><td class="available off" data-title="r5c1">3</td><td class="available off" data-title="r5c2">4</td><td class="available off" data-title="r5c3">5</td><td class="available off" data-title="r5c4">6</td><td class="available off" data-title="r5c5">7</td><td class="available off" data-title="r5c6">8</td></tr></tbody></table></div></div><div class="ranges"><div class="range_inputs"><div class="daterangepicker_start_input"><label for="daterangepicker_start">From</label><input class="input-mini" type="text" name="daterangepicker_start" value=""></div><div class="daterangepicker_end_input"><label for="daterangepicker_end">To</label><input class="input-mini" type="text" name="daterangepicker_end" value=""></div><button class="applyBtn btn btn-small btn-sm btn-success">Apply</button>&nbsp;<button class="cancelBtn btn btn-small btn-sm btn-default">Cancel</button></div></div></div>
    <!-- END CONTENT -->



    <%@ include file="Down.jsp" %>