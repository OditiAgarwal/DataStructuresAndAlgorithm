
import java.util.*;
import java.lang.*;

class SwappingArray{

static void print(int a[], int n)
{
	for(int i = 0; i < n; i++)
		System.out.print(a[i] + " ");
}

static void swapTwo(int x, int y, int[] a)
{
	
	// Store XOR of all in x
	a[x] = a[x] ^ a[y];

	// After this, y has value of x
	a[y] = a[x] ^ a[y];

	// After this, x has value of y
	a[x] = a[x] ^ a[y];
}

// Function to swap three variables
// without using fourth variable
static void swapThree(int x, int y,
					int z, int[] a)
{
	
	// Store XOR of all in a
	a[x] = a[x] ^ a[y] ^ a[z];

	// After this, b has value of a
	a[y] = a[x] ^ a[y] ^ a[z];

	// After this, c has value of b
	a[z] = a[x] ^ a[y] ^ a[z];

	// After this, a has value of c
	a[x] = a[x] ^ a[y] ^ a[z];
}

// Function that swaps n integers
static void rearrangeArray(int a[], int n)
{
	if (n % 2 == 0)
	{
		for(int i = 0; i < n - 1; i += 2)
		{
			
			// Swap 2 variables without
			// using 3rd variable
			swapTwo(i, i + 1, a);
		}
	}
	else
	{
		for(int i = 0; i < n - 3; i += 2)
		{
			
			// Swap 2 variables without
			// using 3rd variable
			swapTwo(i, i + 1, a);
		}

		// The last 3 elements will not form
		// pair if n is odd
		// Hence, swap 3 variables without
		// using 4th variable
		swapThree(n - 1, n - 2, n - 3, a);
	}

	// Print the array elements
	print(a, n);
}
	
// Driver code
public static void main (String[] args)
{
	
	// Given array arr[]
	int arr[] = { 1, 2, 3, 4, 5 };
	int n = arr.length;
	
	// Function call
	rearrangeArray(arr, n);	
}
}

// This code is contributed by offbeat
