from PIL import Image
import sys

def join(img1, img2, flag='horizontal'):
    size1, size2 = img1.size, img2.size
    if flag == 'horizontal':
        joint = Image.new('RGB', (size1[0]+size2[0], size1[1]))
        loc1, loc2 = (0, 0), (size1[0], 0)
        joint.paste(img1, loc1)
        joint.paste(img2, loc2)
    elif flag == 'vertical':
        joint = Image.new('RGB', (size1[0], size1[1]+size2[1]))
        loc1, loc2 = (0, 0), (0, size1[1])
        joint.paste(img1, loc1)
        joint.paste(img2, loc2)
    return joint

for hk in ["mwk", "bsk", "hsk"]:
    photo = Image.open("../webapp/image/create/"+sys.argv[1])
    top = Image.open("img/%s-top.png"%hk)
    left = Image.open("img/%s-left.png"%hk)
    right = Image.open("img/%s-right.png"%hk)
    bot = Image.open("img/%s-bot.png"%hk)
    width, height = photo.size
    print("photo:", photo.size)

    left = left.resize((left.size[0], height))
    right = right.resize((right.size[0], height))

    top = top.resize((width, top.size[1]))
    bot = bot.resize((width, bot.size[1]))
    corner1 = Image.open("img/%s-1.png"%hk)
    corner2 = Image.open("img/%s-2.png"%hk)
    corner3 = Image.open("img/%s-3.png"%hk)
    corner4 = Image.open("img/%s-4.png"%hk)
    img1 = join(join(corner1, top), corner2)
    img2 = join(join(left, photo), right)
    img3 = join(join(corner3, bot), corner4)
    image = join(join(img1, img2, "vertical"), img3, "vertical")
    image.save("../webapp/image/commodity/"+sys.argv[1]+"."+hk+".jpg")
    print("success")

