def hanoi(start, middle, end, firstDisk, lastDisk,A,B,C):
    if firstDisk == lastDisk:
        #this is the base case
        move(lastDisk,start,end,A,B,C)
    else:
        ##moves all disks *but the last one* from start to middle using end as intermediate
        ##now all disk *but the last one* are in middle, the last one is still in start
        hanoi(start,end,middle,firstDisk,lastDisk-1,A,C,B)

        ##move last disk from start to end
        move(lastDisk,start,end,A,B,C)

        ##now move all but last from middle to end -- we are done!
        hanoi(middle,start,end,firstDisk,lastDisk-1,B,A,C)
    
        
def move(disk,fromPeg,toPeg,f,m,e):
    #this is the function that does the work, the actual moving
    e.insert(0,f.pop(0))
    
    print("Move disk", disk, "from", fromPeg, "to",toPeg)
    printp()

def printp():
    print("a:  ",A,"\nb:  ",B,"\nc:  ",C,sep ="")
    print("=========")

nrDisks = int( input("enter nr of disks: "))
A = []
B = []
C = []
for i in range(nrDisks):
    A.append(i+1)

printp()
hanoi("a","b","c",1,nrDisks,A,B,C)