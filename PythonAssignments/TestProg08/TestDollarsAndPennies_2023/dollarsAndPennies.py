money = input("enter amount: ")
moneyF = float(money)
print("total: " , moneyF)

pennies = int(moneyF * 100)

hundreds_ = pennies // 10000
fifties_ = (pennies - hundreds_ * 10000) // 5000
twenties_ = (pennies - hundreds_ * 10000 - fifties_ * 5000) // 2000
tens_ = (pennies - hundreds_ * 10000 - fifties_ * 5000 - twenties_ * 2000) // 1000
fives_ = (pennies - hundreds_ * 10000 - fifties_ * 5000 - twenties_ * 2000 - tens_ * 1000) // 500
ones_ = (pennies - hundreds_ * 10000 - fifties_ * 5000 - twenties_ * 2000 - tens_ * 1000 - fives_ * 500) // 100
quarts_ = (pennies - hundreds_ * 10000 - fifties_ * 5000 - twenties_ * 2000 - tens_ * 1000 - fives_ * 500 - ones_ * 100) // 25
dimes_ = (pennies - hundreds_ * 10000 - fifties_ * 5000 - twenties_ * 2000 - tens_ * 1000 - fives_ * 500 - ones_ * 100 - quarts_ * 25) // 10
nicks_ = (pennies - hundreds_ * 10000 - fifties_ * 5000 - twenties_ * 2000 - tens_ * 1000 - fives_ * 500 - ones_ * 100 - quarts_ * 25 - dimes_ * 10) // 5
penns_ = pennies - hundreds_ * 10000 - fifties_ * 5000 - twenties_ * 2000 - tens_ * 1000 - fives_ * 500 - ones_ * 100 - quarts_ * 25 - dimes_ * 10 - nicks_ * 5

print(hundreds_, " 100 dollar bills")
print(fifties_, " 50 dollar bills")
print(twenties_, " 20 dollar bills")
print(tens_, " 10 dollar bills")
print(fives_, " 5 dollar bills")
print(ones_, " 1 dollar bills")
print(quarts_, " 25 cent coins")
print(dimes_, " 10 cent coins")
print(nicks_, " 5 cent coins")
print(penns_, " 1 cent coins")
