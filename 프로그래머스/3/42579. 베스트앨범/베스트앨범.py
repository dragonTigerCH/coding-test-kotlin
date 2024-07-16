def solution(genres, plays):
    from collections import defaultdict
    # 속한 노래가 많이 재생된 장르를 먼저 수록합니다.
    # 장르 내에서 많이 재생된 노래를 먼저 수록합니다.
    # 장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
    # 장르 별로 가장많이 재생된 노래 최대 2개

    # 장르별 총 재생 횟수를 저장할 딕셔너리
    genre_total_plays = defaultdict(int)
    # 장르별 노래 정보를 저장할 딕셔너리
    genre_songs = defaultdict(list)

    zipped = zip(genres, plays)
    for i, (genre, play) in enumerate(zipped):
        genre_total_plays[genre] += play
        genre_songs[genre].append((play, i))

    sorted_genres = sorted(genre_total_plays.keys(), key=lambda x: genre_total_plays[x], reverse=True)
    result = []
    for genre in sorted_genres:
        sorted_songs = sorted(genre_songs[genre], key=lambda x: (-x[0], x[1]))
        result.extend([(index) for play, index in sorted_songs[:2]])

    return result