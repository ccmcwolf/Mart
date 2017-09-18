<#import "/spring.ftl" as spring>
<nav class="grey darken-4" role="navigation">
    <div class="nav-wrapper container">

        <a id="logo-container" href="<@spring.url '/'/>" class="brand-logo">Mart Online</a>

        <ul class="right hide-on-med-and-down">
            <li><a class="text-lighten-3 active" href="<@spring.url '/shop/explore'/>">Explore Shops</a></li>
        <#--<li><a class="text-lighten-3" href="<@spring.url '/products'/>">Explore Foods</a></li>-->
            <li><a class="text-lighten-3" href="<@spring.url '/delivery'/>">Delivery Area</a></li>
            <li><a class="text-lighten-3" href="<@spring.url '/seller'/>">Seller Area</a></li>
            <li><a class="text-lighten-3" href="<@spring.url '/admin'/>">Admin Area</a></li>

        <#if username??>
        <#if username == "anonymousUser">
            <li><a class="text-lighten-3" href="<@spring.url '/login'/>"> Login</a></li>
            <li><a class="text-lighten-3" href="<@spring.url '/signup'/>">Signup</a></li>
        <#else>
            <li><a class="text-lighten-3"> ${username} </a></li>
            <li><a class="text-lighten-3" href="<@spring.url '/logo'/>"> Logout</a></li>
        </#if>
        </#if>
        </ul>

        <ul id="nav-mobile" class="side-nav">
            <li><a class="text-lighten-3" href="<@spring.url '/explore'/>">Explore Shops</a></li>
            <li><a class="text-lighten-3" href="<@spring.url '/seller'/>">Merchant Area</a></li>
            <li><a class="text-lighten-3" href="<@spring.url '/admin'/>">Admin Area</a></li>

            <li><a href="#" data-activates="slide-out" class="button-collapse"><i class="material-icons">menu</i></a>
            </li>
        </ul>
        <a href="#" data-activates="nav-mobile" class="button-collapse"><i class="material-icons">menu</i></a>
        <br><br>

    </div>
</nav>