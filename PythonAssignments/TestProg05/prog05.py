# note: this is a more complex solution compared to modulus simply for fun and educational purposes
import sys 

n = int(input("how many hours later: ")) # ask user for input, cast to int

if 1 <= n <= 12: # if the num is between 1-12 (inclusive)
    print(n) # print if so
    sys.exit() # stop the program

lowCM = 0 

# loop to look for the lower and higher common mult of twelve relative to num given

i = 1 # iterator
while i < n: # this iterator doesnt really matter since we use keyword break to stop it anyway.
    lowCM = 12 * i # 12 is the multiple we're looking for as there is a consistent pattern with the multiples of twelve.

    if lowCM <= n: # if the current multiple of 12 is less than or equal to the num
        highCM = 12 * (i + 1) # then look for the next multiple of 12 and compare the two to the num

        if highCM > n: # if the higher mult of 12 is greater, than the num, we can conclude that the num is between a lower multiple and a higher one.
            val1 = abs(lowCM - n); # subtract the num from lower mult
            val2 = abs(highCM - n); # subtract num from higher mult , using absolute value only

            if val1 < val2: # test to see which mult is closer to 12 in terms of the clock, closer one = final value
                print(val1)
            else:
                print(val2)

            break

        elif highCM == n: # if the num is equivalent to the higher mult, it must be a multiple of twelve, therefore 12.
            print(12)
            break

    i = i + 1 # iterator


    # very unnecessary program for a simple answer (n % 12), but very fun to figure out from scratch.