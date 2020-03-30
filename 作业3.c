//
//  main.c
//  homework3-2020-3-30
//
//  Created by edz on 2020/3/30.
//  Copyright © 2020 twh. All rights reserved.
//

#include <stdio.h>

int max(int a, int b, int c);

int main(void) {
    
    int a;
    
    int b;
    
    int c;
    
    printf("输入数字a");
    
    scanf("%d",&a);
    
    printf("输入数字b");
    
    scanf("%d",&b);
    
    printf("输入数字c");
    
    scanf("%d",&c);
    
    
    if(a > b || a > c){
        printf("最大的数为%d",a);
    }
    if(b > a || b > c){
        printf("最大的数为%d",c);
    }
    else
        printf("最大的数为%d",c);
    return 0;
}
//
