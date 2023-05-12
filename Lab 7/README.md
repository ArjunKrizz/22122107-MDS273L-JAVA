# Lab 7


Create a new folder in git named 'Lab 7' for the following question and solve the following: create a flowchart and document the results, constraints, etc., in the README.md file for the lab.

Given the famous iris dataset, find the 5-point summary [Mean, Median, Mode, Min, Max] for the attributes: SepalLengthCm, SepalWidthCm, PetalLengthCm, PetalWidthCm.

Once the overall summary statistics have been calculated, identify the summary statistics for each Species of iris flower [Iris-setosa, Iris-versicolor, Iris-virginica].

Present your results in the appropriate format and write the results in a file.

## The methods in the Lab7 class are as follows;

mean(float[] arr): This method calculates the mean (average) of the values in a float array arr by summing up all the values and dividing by the length of the array. The calculated mean value is returned as a float.

sort(float[] arr): This method sorts the values in a float array arr in ascending order using the Bubble Sort algorithm. The sorted array is returned as a float array.

median(float[] arr): This method calculates the median (middle) value of the values in a float array arr. If the length of the array is even, the median is calculated as the average of the two middle values. The calculated median value is returned as a float.

Mode(float[] arr): This method calculates the mode (most frequently occurring) value of the values in a float array arr. The calculated mode value is returned as a float.

min(float[] arr): This method calculates the minimum value of the values in a float array arr. The calculated minimum value is returned as a float.

max(float[] arr): This method calculates the maximum value of the values in a float array arr. The calculated maximum value is returned as a float.

display(String[][] iris, int count, String pathname): This method takes a 2D string array iris, an integer count, and a string pathname as input parameters. It performs statistical analysis on the data in the iris array and displays the results in the form of arrays for various attributes (Sepal Length, Sepal Width, Petal Length, and Petal Width) including minimum, maximum, mean, median, and mode values. The number of values to analyze is determined by the count parameter. The results are displayed on the console.
