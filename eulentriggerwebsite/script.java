<!DOCTYPE html>
<html>
<head>
    <title>Suche auf meiner Website</title>
</head>
<body>
    <h1>Willkommen auf meiner Website</h1>

    <input type="text" id="searchInput" placeholder="Suche...">
    <button onclick="search()">Suchen</button>

    <ul id="searchResults"></ul>

    <script>
        function search() {
            var input = document.getElementById('searchInput').value.toLowerCase();
            var searchResults = document.getElementById('searchResults');
            searchResults.innerHTML = '';

            var elementsToSearch = document.querySelectorAll('h1, h2, p'); // Hier kannst du weitere HTML-Elemente hinzufügen

            for (var i = 0; i < elementsToSearch.length; i++) {
                var element = elementsToSearch[i];
                var text = element.innerText.toLowerCase();

                if (text.indexOf(input) !== -1) {
                    var li = document.createElement('li');
                    li.textContent = element.innerText;
                    searchResults.appendChild(li);
                }
            }
        }
    </script>
</body>
</html>
