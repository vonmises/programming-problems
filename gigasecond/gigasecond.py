# GIGASECOND ANNIVERSARY
# LANGUAGE: PYTHON

# Write a function that will calculate the date that someone will celebrate their 1 gigasecond anniversary.

# Note: A gigasecond is one billion (10**9) seconds.

# The input is three parameters representing someone's birthday.

# As a convenience for celebration planning, the function should also calculate the day of the week and the number of days from today.

# The output should be an array formatted as such: ["YYYY-MM-DD", 'day_of_the_week', days_until]

# You can google datetime in python to familiarize yourself with it


# Examples:

# gigasecond(1988, 5, 15) # ["2020-01-22", "Wednesday", "1764 days left"]
# gigasecond(2015, 2, 17) # ["2046-10-26", "Friday", "11538 days left"]

from datetime import date, timedelta

WEEKDAYS = ("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

def gigasecond(year, month, day):
    giga_birthsecond = date(year, month, day) + timedelta(seconds=1000000000)
    birthday = WEEKDAYS[giga_birthsecond.weekday()]
    days_left = (giga_birthsecond - date.today()).days

    print(giga_birthsecond, birthday, days_left, "days left")

gigasecond(1990, 2, 28)