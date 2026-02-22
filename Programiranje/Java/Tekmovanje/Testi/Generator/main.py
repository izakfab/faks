import itertools


def gen(t, base, k):
    if t == 1:
        return list(itertools.combinations(base, k))
    if t == 2:
        return list(itertools.combinations_with_replacement(base, k))
    if t == 3:
        return list(itertools.permutations(base, k))
    if t == 4:
        return list(itertools.product(base, repeat=k))
    return []


def main():
    count = 1
    for n in range(4, 6):
        for i in range(1, 5):
            for j in range(1, n + 1):
                base = list(range(1, max(n + 1, 6)))
                sez = gen(i, base, j)
                for l in range(len(sez)):
                    f = open("test" + str(count) + ".in", "w")
                    f.write(
                        str(i)
                        + " "
                        + str(len(base))
                        + " "
                        + str(j)
                        + " "
                        + str(l + 1)
                        + "\n"
                    )
                    f.close()

                    f = open("test" + str(count) + ".out", "w")
                    if len(sez[l]) == 1:
                        f.write("[" + str(sez[l])[1] + "]" + "\n")
                    else:
                        f.write("[" + str(sez[l])[1:-1] + "]" + "\n")
                    f.close()
                    count += 1


if __name__ == "__main__":
    main()
