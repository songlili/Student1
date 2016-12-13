
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.rapid-framework.org.cn/rapid" prefix="rapid" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<rapid:override name="content">
    <!-- start: Content -->
    <div id="content" class="span10">


    <ul class="breadcrumb">
        <li>
            <i class="icon-home"></i>
            <a href="index.html">Home</a>
            <i class="icon-angle-right"></i>
        </li>
        <li>
            <i class="icon-edit"></i>
            <a href="#">Forms</a>
        </li>
    </ul>

    <div class="row-fluid sortable">
        <div class="box span12">
            <div class="box-header" data-original-title>
                <h2><i class="halflings-icon edit"></i><span class="break"></span>Form Elements</h2>
            </div>
            <div class="box-content">
                <form class="form-horizontal" action="<%=request.getContextPath()%>/teacher/add">
                    <fieldset>

                        <div class="control-group hidden-phone">
                            <label class="control-label" >老师姓名</label>
                            <div class="controls">
                                <input type="text" name="t.name"  class="form-control"
                                       value="" />
                            </div>
                        </div>

                        <div class="control-group hidden-phone">
                            <label class="control-label" >身份</label>
                            <div class="controls">
                                <input type="text" name="t.status"  class="form-control"
                                       value="" />
                            </div>
                        </div>
                        <div class="control-group hidden-phone">
                            <label class="control-label" >密码</label>
                            <div class="controls">
                                <input type="text" name="t.password"  class="form-control"
                                       value="" />
                            </div>
                        </div>
                        <div class="control-group hidden-phone">
                            <label class="control-label" >详细信息</label>
                            <div class="controls">
                                <input type="text" name="t.information"  class="form-control"
                                       value="" />
                            </div>
                        </div>


                        <div class="form-actions">
                            <button type="submit" class="btn btn-primary">Add</button>
                            <button type="reset" class="btn">Cancel</button>
                        </div>
                    </fieldset>
                </form>

            </div>
        </div><!--/span-->

    </div><!--/row-->
</rapid:override>
<%@ include file="/public/index.jsp" %>