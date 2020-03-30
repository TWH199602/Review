# 作业1
#include <stdio.h>


    
    double cuboid(double length,double width,double height)
    
    {
        double result;
        
        result = length * width * height;
        
        return result;
    }
   
    int main(void){
        double length,width,height;
        
        scanf("%lf长\n",&length);
        
        scanf("%lf宽\n",&width);
        
        scanf("%lf高\n",&height);
        
        printf("%lf 体积是\n",cuboid(length, width, height));

    }
//

# 作业2

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

# 作业3
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
