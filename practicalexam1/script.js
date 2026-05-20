function checkChar() {
    let ch = document.getElementById("charInput").value.toLowerCase();

    if (ch === "") {
        document.getElementById("result").innerHTML = "Please enter a character";
    }
    else if (ch >= 'a' && ch <= 'z') {
        if (ch === 'a' || ch === 'e' || ch === 'i' || ch === 'o' || ch === 'u') {
            document.getElementById("result").innerHTML = ch + " is a Vowel";
        } else {
            document.getElementById("result").innerHTML = ch + " is a Consonant";
        }
    }
    else {
        document.getElementById("result").innerHTML = "Invalid input! Enter a letter only.";
    }
}