N=int(input("Enter No. of frames:"))
frames=[]
for i in range(N):
    fr=int(input("enter value for frame:"))
    frames.append(fr)
frames.insert(0,0)
frames.insert(len(frames),0)
len=len(frames)
#print(len)
#print(frames)
for j in range(1,len):
    if frames[j]==frames[j-1] or frames[j]==frames[j+1]:
        frames.remove(frames[j])
n_frames=len(frames)-2
print(n_frames)




