import pyautogui
import time


auto = pyautogui

loop = 0
while loop <= 15:
    auto.PAUSE = 0.1
    auto.press('win')
    auto.write('chrome')
    auto.press('enter')
    # print(auto.position())

    time.sleep(0.2)
    auto.press('enter')
    auto.write('www.youtube.com')
    auto.press('enter')
    auto.press('F11')
    # time.sleep(3)
    # auto.click(x=418, y=302)
    # time.sleep(3)
    # auto.hotkey('alt', 'F4')
    loop += 1