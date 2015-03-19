<html>
    <body>
        $if(user.isAuthenticated)$
        <h2> Logged in user name : $user.userName$ </h2>
            $if(user.userRoles)$
                <h3>User Roles</h3>
                <ul>
                    $user.userRoles:{
                        <li style="font-weight: bold">$it$</li>
                    }$
                </ul>
            $endif$
        $else$
            <form name="login" action="/validateUser" method="POST">
                <h2>Login</h2>
                <table>
                    <tr>
                        <td style="font-weight: bold">User Name: </td>
                        <td><input type="text" name="username" value="$user.userName$"/></td>
                    </tr>
                    <tr>
                        <td style="font-weight: bold">Password:</td>
                        <td><input type="password" name="password"/></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="right"><input type="submit" name="Login"/></td>
                    </tr>
                </table>
            </form>
        $endif$
    </body>
</html>
