# K-Means-Implementation-in-Java 
The program created is generic for any dataset. 
Any dataset can be given as input to the algorithm after doing data preprocessing. This program should work in both Java7 and Java8. 
## The program takes below inputs:
1.	File: Please give the correct path with file name (example: E:\Iris.txt)
2.	Input value of K – no. of clusters to be created
3.	Distance measure – Euclidean/Manhattan
4.	Maximum iterations – 100/200/300
## Output:
1.	WCSS (Within Cluster Sum of Squares Error) will be shown as output for each iteration.
2.	Final Clustering of data - The dataset features with Cluster number is shown in output (If K=5, the cluster number shown as output is 0, 1, 2, 3, 4)

## This code has been tested on Iris.txt Dataset
## Conclusion:
Using elbow method, we can conclude from the graphs that optimal number of clusters is 3
