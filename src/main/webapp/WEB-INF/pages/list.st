<html>
    <body>
        $if(users)$
            <h2>List of Users</h2>
            $users:{
                <table border="1">
                    <tr>
                        <td>$it.name$</td>
                        <td>$it.email$</td>
                    </tr>
                </table>
            }$
        $else$
            <p>No users found.</p>
        $endif$
    </body>
</html>
