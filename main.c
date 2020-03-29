//
//  main.c
//  weekendwork4
//
//  Created by edz on 2020/3/30.
//  Copyright © 2020 twh. All rights reserved.
//

#include <stdio.h>

int main(void)
{
    int letter, digit, other, i;
    char ch;
    letter = 0;
    digit = 0;
    other = 0;
    
    printf("输入10个字符:");
    
    for( i = 0; i <= 10; i++)
    {
        ch = getchar();
        
        if( (ch>='a' && ch<='z') || (ch>='A' && ch<='Z') )
            
            letter ++;
        else if( ch>='0' && ch<='9')
            digit ++;
        else
            other ++;
        
    }
    
    
    printf("letter=%d,digit=%d,other=%d\n",letter,digit,other);
    return 0;
}
