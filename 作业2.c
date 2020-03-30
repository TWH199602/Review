//
//  main.c
//  homework2-2020-3-30
//
//  Created by edz on 2020/3/30.
//  Copyright © 2020 twh. All rights reserved.
//

#include <stdio.h>

int fib(int n);
int main(void)
{
    int fib(int n);
    int i, j ,k;
    
    i=1;
    
    j=1;

    
    printf("Input n:\n");
    
    printf("%d\n", i);
    
    printf("%d\n", j);
    
    
    scanf("%d",&k);
    
    for(int n = 0; n < k; i++)
        
    {
        k = i + j;
        
        printf("%d\n", i + j);
        
        i = j;
        
        j = k;
        
    }
    return 0;
}
//
