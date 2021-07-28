

#starting the algo
def gapMethod(a1,a2):
    tot = (len(a1)+len(a2))
    # defining GAP
    gap = round((len(a1) + len(a2))/2)
    while (gap>=1):
        for i in range(tot):
            if i+gap<tot:
                if i+gap < len(a1):
                    if a1[i]>a1[i+gap]:
                        a1[i+gap],a1[i] = a1[i],a1[i+gap]
                    else:
                        pass
                elif i+gap>=len(a1) and i<len(a1):
                    # print(i,i+gap-len(a1),"condition where i+gap >len(a1) but i<len(a1)",gap)
                    if a1[i]>a2[i+gap-len(a1)]:
                        a2[i+gap-len(a1)],a1[i] = a1[i],a2[i+gap-len(a1)]
                # elif i==len(a1):
                #     if a2[0]>
                elif i>=len(a1) and i+gap+gap-len(a1)-1<len(a2):
                    # print(i+gap+gap-len(a1)-1,i+gap-len(a1)-1,"i>len(a1)",gap)
                    if a2[i+gap-len(a1)-1]>a2[i+gap+gap-len(a1)-1]:
                        print(a2[i+gap-len(a1)-1],a2[i+gap+gap-len(a1)-1])
                        a2[i+gap+gap-len(a1)-1],a2[i+gap-len(a1)-1] = a2[i+gap-len(a1)-1],a2[i+gap+gap-len(a1)-1]
        # print(gap)
        gap = gap//2
    return (a1,a2)

## sorted Arrays , input
arr1 = [0,7,8,10]
arr2 = [1,4,9]
print(gapMethod(arr1,arr2))
    
                



