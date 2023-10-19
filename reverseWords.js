const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

/**
 * Reverses a given string.
 * param {string} str - The string to be reversed.
 * returns {string} - The reversed string.
 */
function reverseString(str) {
    let reversed = '';
    for (let j = str.length - 1; j >= 0; j--) {
        reversed += str[j];
    }
    return reversed;
}

/**
 * Reverses each word in a sentence.
 * param {string} sentence - The sentence to process.
 * returns {string} - The sentence with each word reversed.
 */
function reverseWords(sentence) {
    let reversedSentence = '';
    let word = '';

    for (let i = 0; i < sentence.length; i++) {
        if (sentence[i] !== ' ') {
            word += sentence[i];
        } else {
            reversedSentence += reverseString(word) + ' ';
            word = '';
        }
    }
    // Handle the last word
    reversedSentence += reverseString(word);

    return reversedSentence;
}

rl.question('Enter a sentence: ', (sentence) => {
    console.log(reverseWords(sentence));
    rl.close();
});
