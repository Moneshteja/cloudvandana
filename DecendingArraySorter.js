const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

/**
 * Sorts an array in descending order using Bubble Sort algorithm.
 * @param {Array<number>} arr - The array of numbers to be sorted.
 * @returns {Array<number>} - The sorted array in descending order.
 */
function bubbleSortDescending(arr) {
    let n = arr.length;
    let swapped;

    do {
        swapped = false;
        for (let i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                // Swap the numbers
                [arr[i], arr[i + 1]] = [arr[i + 1], arr[i]];
                swapped = true;
            }
        }
    } while (swapped);

    return arr;
}

rl.question('Enter an array of numbers separated by spaces: ', (input) => {
    const numbers = input.split(' ').map(num => parseInt(num, 10));
    const sortedNumbers = bubbleSortDescending(numbers);
    console.log(`Sorted in descending order: ${sortedNumbers.join(' ')}`);
    rl.close();
});
