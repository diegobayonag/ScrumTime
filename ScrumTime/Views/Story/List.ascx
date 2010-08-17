﻿<%@ Control Language="C#" Inherits="System.Web.Mvc.ViewUserControl<ScrumTime.ViewModels.StoryCollectionViewModel>" %>

    <table class="storyTable" style="width:943px;font-family:Verdana;padding:0" cellpadding="0" cellspacing="0">                
        <tbody style="font-size:12px;">
            <%  
            foreach (ScrumTime.Models.Story story in Model.Stories)
            {
                %>
                <tr id="storyRow_<%: story.StoryId %>" class="storyRow" style="border:0px" >
                    <% Html.RenderPartial("~/Views/Story/ReadOnly.ascx", story); %>
                </tr>
                <%
            }                               
            %>                      
        </tbody>
    </table>