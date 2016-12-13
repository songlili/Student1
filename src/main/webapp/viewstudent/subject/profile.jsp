<%--
  Created by IntelliJ IDEA.
  User: yt
  Date: 2016/6/22
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
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
                <form class="form-horizontal" action="<%=request.getContextPath()%>/subject/profile">
                    <fieldset>
                        <input type="hidden" name="t.id" value="${sessionScope.t.id}">
                        <div class="control-group hidden-phone">
                            <label class="control-label" >ID</label>
                            <div class="controls">
                                <input type="text" name="t.id"  class="form-control"
                                       value="${sessionScope.t.id}" disabled=""/>
                            </div>
                        </div>

                        <div class="control-group hidden-phone">
                            <label class="control-label" >课程名称</label>
                            <div class="controls">
                                <input type="text" name="t.name"  class="form-control"
                                       value="${sessionScope.t.name}" />
                            </div>
                        </div>

                        <div class="control-group hidden-phone">
                            <label class="control-label" >收费结构</label>
                            <div class="controls">
                                <input type="text" name="t.fee"  class="form-control"
                                       value="${sessionScope.t.fee}" />
                            </div>
                        </div>

                        <div class="control-group hidden-phone">
                            <label class="control-label" >学生须知</label>
                            <div class="controls">
                                <input type="text" name="t.necessary"  class="form-control"
                                       value="${sessionScope.t.necessary}" />
                            </div>
                        </div>
                        <div class="control-group hidden-phone">
                            <label class="control-label" >详细信息</label>
                            <div class="controls">
                                <input type="text" name="t.information"  class="form-control"
                                       value="${sessionScope.t.information}" />
                            </div>
                        </div>


                        <div class="form-actions">
                            <button type="submit" class="btn btn-primary">Save changes</button>
                            <button type="reset" class="btn">Cancel</button>
                        </div>
                    </fieldset>
                </form>

            </div>
        </div><!--/span-->

    </div><!--/row-->
</rapid:override>
<%@ include file="/public/indexstudent.jsp" %>
