class Solution:
    def decodeAtIndex(self, s: str, k: int) -> str:
        # The method below will exceed the memory limit
        # ----------------------------------------------------
        # base_str = ""
        # repeat_times = 1
        # for ch in s:
        #     if ch.isdigit():
        #         repeat_times *= int(ch)
        #     else:
        #         base_str = base_str * repeat_times + ch
        #         repeat_times = 1
        #     if len(base_str) * repeat_times >= k:
        #         return base_str[(k % len(base_str)) - 1]
        # ----------------------------------------------------

        length = 0
        pos = 0
        while pos < len(s) and length < k:
            if s[pos].isdigit():
                length *= int(s[pos])
            else:
                length += 1
            pos += 1

        pos -= 1

        while pos >= 0:
            if s[pos].isdigit():
                length //= int(s[pos])
                k %= length
            else:
                if k == length or k == 0:
                    return s[pos]
                length -= 1
            pos -= 1

        # for ch in range(pos - 1, -1, -1):
        #     if s[ch].isdigit():
        #         length //= int(s[ch])
        #         k %= length
        #     else:
        #         if k == length or k == 0:
        #             return s[ch]
        #         length -= 1