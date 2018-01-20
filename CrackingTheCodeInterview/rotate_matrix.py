# matrix = [[1,2,3,4,5], [6,7,8, 9,10], [11, 12, 13, 14, 15],[16,17,18,19,20],[21,22,23,24,25]]
matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]]
def rotate_matrix(n):
    v = (int)(n/2)
    for layer in range(0,v):
        first = layer
        last =  n-layer-1
        if(first>last):
                break
        for i in range(0, last-first):
            
            top_left = (first, (first+i))
            top_right = ((first+i), last)
            bottom_left = ((last-i), first)
            bottom_right = (last, (last-i))
            print(top_left, top_right, bottom_left, bottom_right)
            swap_index(top_left,top_right,bottom_left,bottom_right)


def swap_index(top_left, top_right, bottom_left, bottom_right):
    temp = matrix[top_left[0]][top_left[1]]
    matrix[top_left[0]][top_left[1]] = matrix[bottom_left[0]][bottom_left[1]]
    matrix[bottom_left[0]][bottom_left[1]] = matrix[bottom_right[0]][bottom_right[1]]
    matrix[bottom_right[0]][bottom_right[1]] = matrix[top_right[0]][top_right[1]]
    matrix[top_right[0]][top_right[1]] = temp


rotate_matrix(4)

print(matrix)
