class Solution(object):
    def finalPositionOfSnake(self, n, commands):
        row,col=0,0
        for c in commands:
            if c=="UP":
                row-=1
            elif c=="DOWN":
                row+=1
            elif c=="LEFT":
                col-=1
            elif c=="RIGHT":
                col+=1
        return row*n+col