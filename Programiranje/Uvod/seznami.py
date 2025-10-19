import numpy as np
from math import log, cos
from bisect import bisect_left

a = np.array([23, 42, 87, 0, 1, 1, 34, 1, -3, 2])

vsota = 0
for el in a:
    vsota += el
vsota /= len(a)
