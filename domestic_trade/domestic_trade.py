# DOMESTIC TRADE
# LANGUAGE: PYTHON

# You have been hired by a trade company to write a program.

# They have given you a CSV (comma separated value, used in spreadsheets) file containing sales data by transaction
#for 10,000 sales transactions.

# Write a function that calculates the grand total of sales for a given item across all stores.

# Your output should be in a form of a dictionary, with total_KSH as a key and the total as a value.

# Additionally, the company wants to know which store location made the largest sales for that item. Add that as another hash key-value pair.

# Notes:
#  - Check out this website for an intro to handling CSV files

# Example:

#   Given a `TRANS.csv` of:

#   store,sku,amount
#   Nairobi,DM1210,7000 KSH
#   Nairobi,DM1182,1968 KSH
#   Naivasha,DM1182,5858 KSH
#   Mombasa,DM1210,6876 KSH
#   Nakuru,DM1182,5464 KSH

# If we enter 'DM1182', you program should return:
# {:total_KSH=> 13290, :largest=> 'Nairobi'}.

def domestic_trade(itemId):
    input_file = open("TRANS.csv", "r")
    store_sales = input_file.readlines()
    input_file.close()
    
    stores = {}

    for store_sale in store_sales:
        columns = store_sale.split(",")

        if itemId in columns[1]:
            amount = int(columns[2][:-5])
            store = columns[0]

            if store in stores.keys():
                stores[store] += amount
            else:
                stores[store] = amount

    print("total KSH => " + str(sum(stores.values())) + ", " +
          "largest => " + str(max(stores, key=stores.get)))

domestic_trade("DM1182")
