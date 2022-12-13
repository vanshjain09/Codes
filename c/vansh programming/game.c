#include <stdio.h>
#include <stdlib.h>
#include <time.h>

main()
{

    int number1, guess1;
    int nguess = 0;
    srand(time(0));
    number1 = rand() % 100 + 1;
    // till now random number is generarted
    printf("TURN OF PLAYER 1\n");

    do
    {
        printf("Guess the number between 1 to 100:\n");
        scanf("%d", &guess1);

        if (guess1 > number1)
        {
            printf("Lower number please!\n");
        }
        else if (guess1 < number1)
        {
            printf("Higher number please!\n");
        }
        else
        {
            printf("You guess the number in %d attempts\n", nguess);
        }
        nguess++;
    } while (guess1 != number1);
    // PLAYER 2
    int number2, guess2;
    int nguess2 = 0;
    srand(time(0));
    number2 = rand() % 100 + 1;

    printf("TURN OF PLAYER 2\n");
    do
    {
        printf("Guess the number between 1 to 100:\n");
        scanf("%d", &guess2);

        if (guess2 > number2)
        {
            printf("Lower number please!\n");
        }
        else if (guess2 < number2)
        {
            printf("Higher number please!\n");
        }
         else
        { 
            printf("You guess the number in %d attempts\n", nguess2);
        }
        nguess2++;
    } while (guess2 != number2);

    if (nguess > nguess2)
    {
        printf("WINNER IS PLAYER 2\n");
    }
    else if (nguess < nguess2)
    {
        printf("WINNER IS PLAYER 1\n");
    }

    else if(nguess==nguess2)
    {
        printf("Match is drawn(play again)\n");
    }
}