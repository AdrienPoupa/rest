<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add a grade</title>
</head>
<body>
<form action="./rest/notes" method="POST">
    <label for="movieId">Movie ID</label>
    <input id="movieId" name="movieId" required />
    <br/>
    <label for="mark">Mark</label>
    <input id="mark" name="mark" size="3" required /> /100
    <br/>
    <input type="submit" value="Submit" />
</form>
</body>
</html>