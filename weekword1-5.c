//
//  main.c
//  weekend1-5
//
//  Created by edz on 2020/3/30.
//  Copyright © 2020 twh. All rights reserved.
//

#include <stdio.h>

int main(void)
{
    int i , m;
    
    scanf("%d", &m);
    
    for( i = 2; i <= m/2; i++)
        if(m % i == 0)
            break;
    if(i > m/2 && m!=1)
        printf("是\n");
    else
    printf("否\n");
    return 0;
}
